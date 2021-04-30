package inheritanceHomeworkk;

public class InstructorManager extends UserManager {
	
	CourseManager courseManager = new CourseManager();
	public void listStudent(Student[] students) {
		
		for(Student student :students) {
			System.out.println(student.getFirstName()+
			" "+ student.getLastName()+
			" "+student.getStudent_number());
		}
	}
	
	public void addCourse(Course course) {
	
		courseManager.Add(course);
	}
	
	
	

	public void deleteCourse(Course course) {
		courseManager.delete(course.getCourseId()-1);
		System.out.println("silindi..");
		
	}


	
}
