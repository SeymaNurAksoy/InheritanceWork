package inheritanceHomeworkk;

public class StudentManager  extends UserManager{

	public void registerCourse() {
		
	}

	public void courseProgramDetail(Course course) {

		System.out.println(course.getCourseDetail());
	}
	public void listCourseProgram(Student student ) {
		
		for(Course item :  student.getCourses()) {
			System.out.println(item.getCourseName());
		}
	}
}
