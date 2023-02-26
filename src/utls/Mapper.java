package utls;

import data.models.Users;
import dtos.requests.RegisterRequest;
import dtos.responses.FindUserResponse;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Mapper {
    public static Users mapDtoToUser (RegisterRequest registerRequest){
        Users user = new Users();
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.setUserName(registerRequest.getUserName());
        user.setPassword(registerRequest.getPassword());
        return user;
    }

    //public static void map (RegisterRequest registerRequest, User user) {
    //  user.setFirstName(registerRequest.getFirstName());
    //  user.setLastName(registerRequest.getLastName());
    // user.setUserName(registerRequest.getUserName());
    // user.setPassword(registerRequest.getPassword());
    // }

    public static Users mapUserToDto ( FindUserResponse response) {
        Users foundUser = new Users();
        response.setFullName(foundUser.getFirstName()+ " " + foundUser.getLastName());
        response.setUserId(foundUser.getId());
        response.setUserName(foundUser.getUserName());
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("E, dd/mm/yyyy, hh:mm a");
        response.setDateRegistered(foundUser.getDateRegistered());
        return response;
    }

}