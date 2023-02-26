package data.repositories;

import data.models.Users;
import dtos.requests.RegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serrvices.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceImplTest {

    private UserService userService;
    private RegisterRequest request;

    @BeforeEach
    public void setUp() {
        userService = new UserServiceImpl();
        request = new RegisterRequest();
        request.setFirstName("Mich");
        request.setLastName("Josh");
        request.setUserName("mc");
        request.setPassword("1234");
    }

    @Test
    void test_saveNewUser_Id() {
        Users savedUsers = userService.register(request);
        assertTrue(savedUsers.getId() != 0);
    }

    @Test
    void test_duplicateUserNameThrowsException() {
        request.setFirstName("Ike");
        request.setLastName("Josh");
        request.setUserName("mc");
        request.setPassword("1234");
        userService.register(request);
        assertThrows(IllegalArgumentException.class, () -> userService.register(request));
    }

    @Test
    public void test_findUserById() {
        userService.register(request);
        assertEquals("Mich", userService.findUser(1).getFirstName());
    }

    //todo add throws exceptionWhenUserIdIsWrong
    @Test
    public void test_throwExceptionWhenIdIsWrong() {
        userService.register(request);
        assertThrows(IllegalArgumentException.class, () -> userService.register(request));

    }
}
