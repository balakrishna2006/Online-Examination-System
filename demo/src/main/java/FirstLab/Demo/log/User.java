package FirstLab.Demo.log;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class User {
    
    @NotBlank(message="Username is required")
    @Pattern(regexp="^[A-Za-z0-9]+$", message="Only aplhanumeric are allowed")
    private String Username;

    @NotBlank(message="Password is required")
    @Size(min=6, message="password must be atleast 6 characters")
    private String Password;

    public String getUsername(){
        return Username;
    }

    public void setUsername(String username){
        this.Username=username;
    } 

    public String getPassword(){
        return Password;
    }

    public void setPassword(String password){
        this.Password=password;
    }
}
