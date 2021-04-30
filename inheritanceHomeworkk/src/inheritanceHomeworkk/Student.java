package inheritanceHomeworkk;

public class Student extends User {

	

	String student_number;
	Course[] courses;


	

	public Student(int id, String firstName, String lastName, String password, String student_number,
			Course[] courses) {
		super(id, firstName, lastName, password);
		this.student_number = student_number;
		this.courses = courses;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public String getStudent_number() {
		return student_number;
	}

	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	
	
}
