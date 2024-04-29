/*
 * Author Name:
 * Date: 4/26/2024
 * Created With: IntelliJ IDEA Community Edition
 */


package examifyserver.com.model;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

    private  String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return "";
    }
}
