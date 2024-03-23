/*
 * Author Name:
 * Date: 3/23/2024
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    @Id
    private long roleId;
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL,fetch =FetchType.LAZY,mappedBy = "role")
    private Set<UserRole> userRole = new HashSet<>();
    public  Role (){

    }

    public Role(long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
}
