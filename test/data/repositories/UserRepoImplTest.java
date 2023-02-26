package data.repositories;

import data.models.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepoImplTest {
    private UserRepo userRepo;
    private Users users;

    @BeforeEach
    public void setup(){
        userRepo = new UserRepoImpl();
        users = new Users();
        users.setUserName("Mike");
        users.setLastName("Josh");
        users.setUserName("mike");
        users.setPassword("1234");
    }

    @Test public void saveOneUser_countIsOneTest(){
        userRepo.save(users);
        assertEquals(1, userRepo.count());
    }

    @Test public void saveOneUser_idOfUserIsOneTest(){
        Users savedUsers = userRepo.save(users);
        assertEquals(1, savedUsers.getId());
    }

    @DisplayName("Update Users Test")
    @Test public void saveTwoUsersWithSameId_countIsOneTest(){
      Users savedUsers = userRepo.save(users);
      assertEquals(1, userRepo.count());
      savedUsers.setLastName("Josh");
      userRepo.save(savedUsers);
      assertEquals(1, userRepo.count());
    }

    @Test public void saveOneUser_findUserByIdTest(){
        Users savedUsers = userRepo.save(users);
        assertEquals(1, savedUsers.getId());
        Users foundUsers = userRepo.findById(1);
        assertEquals(foundUsers, savedUsers);
    }

    @Test public void savaOneUser_deleteOneUser_countIsZeroTest(){
        Users savedUsers = userRepo.save(users);
        assertEquals(1, savedUsers.getId());
        userRepo.delete(1);
        assertEquals(0, userRepo.count());
    }
}