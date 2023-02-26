package controllers;

import data.repositories.UserServiceImpl;
import dtos.requests.RegisterRequest;
import serrvices.UserService;

public class UsersController {

    private final UserService userService = new UserServiceImpl();

    public Object register(RegisterRequest request) {
        try {
            return userService.register(request);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    public Object findUserById(int response) {
        return userService.findUser(response);
    }

}