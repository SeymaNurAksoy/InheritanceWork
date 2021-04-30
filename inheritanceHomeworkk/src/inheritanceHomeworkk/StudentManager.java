package inheritanceHomeworkk;

public class StudentManager  extends UserManager{

	public void registerCourse() {
		
	}
	
	public void listCourseProgram(Student student) {
		
		for(Course course : student.getCourses()) {
			System.out.println(course.getCourseName());
		}
	}
	 
	public void courseProgramDetail(Course course) {

		System.out.println(course.getCourseDetail());
	}
}
