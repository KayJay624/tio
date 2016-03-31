package mm.beans;
public class UserBean implements java.io.Serializable {
	private String name;
	private String email;
	private int age;
	
	public UserBean() {}
	
	public String getName() { return name; }
	
	public void setName(String username) {
		this.name = username;
	}
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAge() { 
		return Integer.toString(age); 
	}
	
	public void setAge(String age) {
		this.age = Integer.valueOf(age);
	}
}