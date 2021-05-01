package inheritanceHomeworkk;

public class Instructor extends User {

	String about;
	

	Course[] courses;
	
	
	public Instructor(int id, String firstName, String lastName, String password, String about, Course[] courses) {
		super(id, firstName, lastName, password);
		this.about = about;
		this.courses = courses;
	}

	public Instructor(int id, String firstName, String lastName, String password, String about) {
		super(id, firstName, lastName, password);
		this.about = about;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
}
