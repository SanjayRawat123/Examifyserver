/*
 * Author Name:
 * Date: 12/14/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.service.impl;


import examifyserver.com.model.User;
import examifyserver.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUserName(username);
        if (user == null) {
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("No user Found");
        }


        return user;
    }
}
