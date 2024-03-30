/*
 * Author Name:Sanjay Singh Rawat
 * Date: 3/24/2024
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.controller;

import examifyserver.com.model.Role;
import examifyserver.com.model.User;
import examifyserver.com.model.UserRole;
import examifyserver.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(44L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user, roles);
    }


    @GetMapping(value = "/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return this.userService.fatchUserByUserName(userName);
    }


    @DeleteMapping(value = "/{id}")
    public void deletfun1(@PathVariable("id") long id){
        this.userService.deleteUser(id);

    }
}
