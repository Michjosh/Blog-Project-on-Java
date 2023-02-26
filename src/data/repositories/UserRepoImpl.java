package data.repositories;

import data.models.Users;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepo {
private int count = 0;

private List<Users> users = new ArrayList<>();
    @Override
    public Users save(Users users) {
        boolean userHasNotBeenSaved = users.getId() == 0;
        if(userHasNotBeenSaved){
            users.setId( generateId());
            this.users.add(users);
            count++;
        }

        return users;
    }

    private int generateId() {
        return count+1;
    }

    @Override
    public Users findById(int id) {
        for(Users users : this.users) if (users.getId() == id) return users;

        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public void delete(Users users) {

    }

    @Override
    public void delete(int id) {
        for (Users users : this.users){
            if (users.getId() == id){
                this.users.remove(users);
                count--;
                break;
            }
        }

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Users findUsername(String username) {
        for (Users users : this.users){
            if (users.getUserName().equalsIgnoreCase(username)) return users;
        }
        return null;
    }


}
