package data.repositories;

import data.models.Users;

import java.util.List;

public interface UserRepo {

    Users save(Users users);
    Users findById(int id);
    long count();
    List<Users> findAll();
    void  delete (Users users);
    void delete (int id);
    void deleteAll();

    Users findUsername(String username);

}
