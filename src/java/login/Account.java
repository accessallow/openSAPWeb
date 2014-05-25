

package login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private String username;
    private String password;
    private int right_level;

    public Account() {
    }
    

    public Account(String username, String password, int right_level) {
        this.username = username;
        this.password = password;
        this.right_level = right_level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRight_level() {
        return right_level;
    }

    public void setRight_level(int right_level) {
        this.right_level = right_level;
    }
    
    
    
}
