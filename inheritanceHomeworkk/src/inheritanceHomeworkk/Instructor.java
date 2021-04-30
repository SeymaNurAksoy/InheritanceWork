package inheritanceHomeworkk;

public class Instructor extends User {

	String about;
	Course[] instructorCourses;


	public Instructor(int id, String firstName, String lastName, String password, String about,
			Course[] instructorCourses) {
		super(id, firstName, lastName, password);
		this.about = about;
		this.instructorCourses = instructorCourses;
	}

	public Course[] getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(Course[] instructorCourses) {
		this.instructorCourses = instructorCourses;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
