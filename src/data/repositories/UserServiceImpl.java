package data.repositories;

import data.models.Users;
import dtos.requests.RegisterRequest;
import dtos.responses.FindUserResponse;
import serrvices.UserService;
import utls.Mapper;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo = new UserRepoImpl();

    @Override
    public Users register(RegisterRequest request) {
        if (userExist(request.getUserName())) throw new IllegalArgumentException(request.getUserName() + " already exists");
        return userRepo.save(Mapper.mapDtoToUser(request));
    }

    @Override
    public Users findUser(int id) {
        return userRepo.findById(id);
    }

    private boolean userExist(String username){
       Users foundUsers = userRepo.findUsername(username);
       if (foundUsers != null) return true;
       return false;
        }
}
