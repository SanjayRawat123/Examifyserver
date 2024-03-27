package examifyserver.com.service;

import examifyserver.com.model.User;
import examifyserver.com.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user , Set<UserRole>userRoles) throws Exception;

    //get Specific User
    public User fatchUserByUserName(String userName);

    //delete user by id
    public void deleteUser(long id);
}
