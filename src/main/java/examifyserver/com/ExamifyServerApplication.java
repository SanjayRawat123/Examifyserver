package examifyserver.com;

import examifyserver.com.model.Role;
import examifyserver.com.model.User;
import examifyserver.com.model.UserRole;
import examifyserver.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamifyServerApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamifyServerApplication.class, args);
		System.out.println("hello exam portal see here ");
	}

    @Override
    public void run(String... args) throws Exception {
//        User user =new User();
//        user.setFirstName("Sanjay");
//        user.setLastName("Rawat");
//        user.setUsername("ra@123");
//        user.setPassword("12345");
//        user.setEmail("abc@123");
//        Role rol1 = new Role ();
//        rol1.setRoleId(45);
//        rol1.setRoleName("Admin");
//        Set<UserRole> userRoleSet =new HashSet<>();
//        UserRole userRole = new UserRole();
//        userRole.setRole(rol1);
//        userRole.setUser(user);
//
//        userRoleSet.add(userRole);
//        User user1	=this.userService.createUser(user,userRoleSet);
//        System.out.println("user1.getUsername");
    }
}
