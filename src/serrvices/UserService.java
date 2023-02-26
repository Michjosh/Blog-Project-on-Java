package serrvices;

import data.models.Users;
import dtos.requests.RegisterRequest;

public interface UserService {
    Users register(RegisterRequest request);

    Users findUser(int foundUser);

}
