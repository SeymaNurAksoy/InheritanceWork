package inheritanceHomeworkk;



public class Main {

	public static void main(String[] args) {
		Course course =new Course("Kurs Görsel",1,1,"Java kursu",20,"Engin","Demiroğ","1 aylık kurs 3 saat");
		Course course1 =new Course("Kurs Görsel",2,1,"C# kursu",20,"Engin","Demir","1 aylık kurs 3 saat");
		Course course2 =new Course("Kurs Görsel",3,1,"C++ kursu",20,"Engin","Demiroğ","1 aylık kurs 3 saat");
		Course addedCourse1=new Course("Kurs Görsel",1,1,"C# kursu");
		Course addedCourse2=new Course("Kurs Görsel",2,1,"Pyhton kursu");
		
		Course[] studentCourses = {course,course1};
		Course[] studentCourses2 = {course,course1,course2};
		Course[] instructorCourses = {addedCourse1,addedCourse2};
		 
		Student studentUser = new Student(1,"Faik","B","123","333",studentCourses);
		Student studentUser2 = new Student(1,"Fahri","B","123","333",studentCourses2);
		Instructor user1 = new Instructor(1, "Engin", "Demiroğ", "111", "ABCD", instructorCourses);
		User[] users = {studentUser,user1};
		Student[] studentUsers = {studentUser,studentUser2};
		//User[] users = {user};
		UserManager manager = new UserManager();
		manager.register(users);
		manager.login(users);
		manager.logout(users);
		
		System.out.println("Liste-----");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.listStudent(studentUsers);
		
		System.out.println("eklendi");
		instructorManager.addCourse(addedCourse2);
		instructorManager.addCourse(addedCourse1);
		System.out.println("silindi");
		//instructorManager.deleteCourse(addedCourse1);
		System.out.println("listelenddi");
		instructorManager.listCourse();
		
		System.out.println("studentuser2 kurs listesi");
		
		StudentManager studentManager = new StudentManager();
		studentManager.listCourseProgram(studentUser2);
		System.out.println("detay");
		//istenilen kursun detayı
		studentManager.courseProgramDetail(course);
		
		
		
		
		
		
		
		

	}

}
