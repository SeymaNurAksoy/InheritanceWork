package inheritanceHomeworkk;

import java.util.ArrayList;

public class UserManager {

	public UserManager() {
		super();
		
	}

	//sisteme ayný anda birden fazla giriþ olabilir
	
	public void login(User[] users) {
	
		for(User user : users) {
			
		System.out.println(user.getFirstName() + " "+user.lastName
			+" giriþ yapýldý.");
		}
	}
	
	public void logout(User[] users) {
		for(User user : users) {
		System.out.println(user.getFirstName() + " "+user.lastName
				+" çýkýþ yapýldý.");	
	}
	}
	
	public void register(User[] users) {
		for(User user : users) {
		System.out.println(user.getFirstName() + " "+user.lastName + " "+user.getPassword()
				+" kayýt yapýldý.");	
	}
	}
	
	
	public void listCourseProgram(User user) {
		
		for(Course course : user.getCourses()) {
			System.out.println(course.getCourseName());
		}
	}
	 
	
}
