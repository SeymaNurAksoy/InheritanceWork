package inheritanceHomeworkk;

public class Course {
	
	String gorsel;
	
	int courseId;
	
	int categoryId;
	
	String courseName;
	
	int progressPercentage;
	
	String teacherName;
	
	String teacherLastname;
	
	String courseDetail;
	
	
	
	
	public Course(String gorsel, int courseId, int categoryId, String courseName) {
		super();
		this.gorsel = gorsel;
		this.courseId = courseId;
		this.categoryId = categoryId;
		this.courseName = courseName;
		
	}
	public Course() {
		super();
	}

	public Course(String gorsel, int courseId, int categoryId, String courseName, int progressPercentage,
			String teacherName, String teacherLastname, String courseDetail) {
		super();
		this.gorsel = gorsel;
		this.courseId = courseId;
		this.categoryId = categoryId;
		this.courseName = courseName;
		this.progressPercentage = progressPercentage;
		this.teacherName = teacherName;
		this.teacherLastname = teacherLastname;
		this.courseDetail = courseDetail;
	}
	
	
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public String getGorsel() {
		return gorsel;
	}
	public void setGorsel(String gorsel) {
		this.gorsel = gorsel;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getProgressPercentage() {
		return progressPercentage;
	}
	public void setProgressPercentage(int progressPercentage) {
		this.progressPercentage = progressPercentage;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherLastname() {
		return teacherLastname;
	}
	public void setTeacherLastname(String teacherLastname) {
		this.teacherLastname = teacherLastname;
	}
	
}
