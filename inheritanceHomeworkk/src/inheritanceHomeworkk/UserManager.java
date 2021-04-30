package inheritanceHomeworkk;

import java.util.ArrayList;

public class UserManager {

	public UserManager() {
		super();
		
	}

	//sisteme ayn� anda birden fazla giri� olabilir
	
	public void login(User[] users) {
	
		for(User user : users) {
			
		System.out.println(user.getFirstName() + " "+user.lastName
			+" giri� yap�ld�.");
		}
	}
	
	public void logout(User[] users) {
		for(User user : users) {
		System.out.println(user.getFirstName() + " "+user.lastName
				+" ��k�� yap�ld�.");	
	}
	}
	
	public void register(User[] users) {
		for(User user : users) {
		System.out.println(user.getFirstName() + " "+user.lastName + " "+user.getPassword()
				+" kay�t yap�ld�.");	
	}
	}
	
	
	public void listCourseProgram(User user) {
		
		for(Course course : user.getCourses()) {
			System.out.println(course.getCourseName());
		}
	}
	 
	
}
