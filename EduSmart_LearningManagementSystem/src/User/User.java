package User;

import java.util.ArrayList;

interface ProgressTrackable{
	void trackProgress();
}

abstract public class User {

	private String name;
	private String email;
	private String userID;
	
	private static ArrayList<String> courseList = new ArrayList<>();
	
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
	public final void displayWelcome() {
		System.out.println("Welcome to EduSmart, "+name+ "!");
		
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

	public ArrayList<String> getCourseList() {
		return courseList;
	}

	public void setCourseList(String courseList) {
		this.courseList.add(courseList);
		courseList.
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
		this.maxStudents = 20;
	}
	
	public void showCourseDetails() {
		System.out.println("Details for "+title);
		System.out.println("Duration: "+durationInHours);
		System.out.println("Maximum students allowed: "+maxStudents);
		System.out.println("Number of students enrolled for course: ");
	}
}