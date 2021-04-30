package inheritanceHomeworkk;

public class User {

	int id;
	String firstName;
	String lastName;
	String password;
	Course[] courses;
	
	
	


	public User(int id, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	
	
	


	
public User(int id, String firstName, String lastName, String password, Course[] courses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.courses = courses;
	}






public Course[] getCourses() {
		return courses;
	}


	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
