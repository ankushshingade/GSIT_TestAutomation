package User;

interface ProgressTrackable{
	void trackProgress();
}

abstract public class User {

	private String name;
	private String email;
	private String userID;
	
	// Constructors for User
	User(String name, String email, String userID){
		this.setName(name);
		this.setEmail(email);
		this.setUserID(userID);
	}
	
	User(){
		System.out.println("Please provide name, email and userID." );
	}
	
	// abstract method "viewProfile"
	abstract void viewProfile(); 

	// Welcome message
	final void displayWelcome() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

}

class Student extends User implements ProgressTrackable{

	String enrolledCourse1;
	String enrolledCourse2;
	
	@Override
	public void trackProgress() {
		
	}
	
	@Override
	void viewProfile() {
		System.out.println("Student name: "+getName());
		System.out.println("Student email: "+getEmail());
		System.out.println("Student userID: "+getUserID());	
	}
	
	public void  enrollCourse(String courseName) {
		
	}
}

class Instructor extends User {

	@Override
	void viewProfile() {
		System.out.println("Instructor name: "+getName());
		System.out.println("Instructor email: "+getEmail());
		System.out.println("Instructor userID: "+getUserID());	
		
	}
	
}

class Admin extends User {

	@Override
	void viewProfile() {
		System.out.println("Admin name: "+getName());
		System.out.println("Admin email: "+getEmail());
		System.out.println("Admin userID: "+getUserID());	
		
	}
	
}

class Course {
	
	String title;
	int durationInHours;
	final int maxStudents;
	
	// Constructors
	Course(String title, int durationInHours, int maxStudents){
		this.title = title;
		this.durationInHours = durationInHours;
		this.maxStudents = maxStudents;
	}
	
	Course(String title){
		this.title = title;
		this.maxStudents = 2;
	}
	
	void showCourseDetails() {
		
	}
}