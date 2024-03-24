package examifyserver.com.repository;

import examifyserver.com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
     User findByUserName(String userName);
}
