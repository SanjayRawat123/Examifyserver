/*
 * Author Name:
 * Date: 3/23/2024
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.service.impl;

import examifyserver.com.model.User;
import examifyserver.com.model.UserRole;
import examifyserver.com.repository.RoleRepository;
import examifyserver.com.repository.UserRepository;
import examifyserver.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUserName(user.getUserName());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new Exception("User already present !!");
        } else {
            //user create
            for (UserRole userRole : userRoles) {
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }
        return  local;
    }

    @Override
    public User fatchUserByUserName(String userName) {
        return this.userRepository.findByUserName(userName);
    }

    @Override
    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }
}
