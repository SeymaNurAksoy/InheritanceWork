package inheritanceHomeworkk;

import java.util.ArrayList;

public class CourseManager {
	
	ArrayList<Course> courses = new ArrayList<Course>();;
	public void Add(Course course) {
	/*	 System.out.println(course.gorsel 
				 +"\n"+ course.courseName 
				 +"\n %"+ course.progressPercentage +" tamamlandý"
				 +"\n"+ course.teacherName+" "+course.teacherLastname );
		*/
		courses.add(course);
		System.out.println(courses.size());
		 
	}

	public void update(int id,String gorsel,String name,String teacherName,String teacherLastName) {
		for (Course course :courses) {
			if (course.courseId == id ) {
				course.gorsel = gorsel;
				course.courseName=name;
				course.teacherName =teacherName;
				course.teacherLastname=teacherLastName;
				
				System.out.println(course.gorsel 
					 +"\n"+ course.courseName 
					 +"\n"+ course.teacherName+" "+course.teacherLastname );
				System.out.println("Updated...");
			}else {
				System.out.println("Hata...");
			}
			
			
		}
				
	}

	public void delete(int id) {
		courses.remove(id);
	}
	
	public void listCourse() {
		for(Course course :courses) {
			System.out.println(course.getCourseName());
		}
	}
}
