package inheritanceHomeworkk;

public class Instructor extends User {

	String about;
	


	
	
	public Instructor(int id, String firstName, String lastName, String password, String about,Course[] courses) {
		super(id, firstName, lastName, password,courses);
		this.about = about;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
