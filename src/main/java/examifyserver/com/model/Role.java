/*
 * Author Name:Sanjay Singh Rawat
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

    public long getRoleId() {
        return roleId;
    }

    public Role setRoleId(long roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public Role setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
        return this;
    }
}
