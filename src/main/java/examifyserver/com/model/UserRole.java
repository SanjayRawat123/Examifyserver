/*
 * Author Name:
 * Date: 3/23/2024
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.model;

import jakarta.persistence.*;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private  User user;
    @ManyToOne
    private Role role;

    public UserRole(){}

    public UserRole(long userRoleId, User user, Role role) {
        this.userRoleId = userRoleId;
        this.user = user;
        this.role = role;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public UserRole setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserRole setUser(User user) {
        this.user = user;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}
