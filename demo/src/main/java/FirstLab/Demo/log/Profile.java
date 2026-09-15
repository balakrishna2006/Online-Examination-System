package FirstLab.Demo.log;


public class Profile {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstname){
        this.firstName=firstname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastname){
        this.lastName=lastname;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=Email;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		this.password = Password;
	}

    public int getAge() {
		return age;
	}

	public void setAge(int Age) {
		this.age = Age;
	}



}
