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
	private ArrayList<Course> courseDetails = new ArrayList<>();
	
	
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

	// getter and setter
	
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
	}
	
	public ArrayList<Course> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(ArrayList<Course> courseList) {
		this.courseDetails = courseList;
	}


}
