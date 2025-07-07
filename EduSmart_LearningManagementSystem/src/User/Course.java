package User;


public class Course {
	
	private String title;
	private int durationInHours;
	private int maxStudents;		// "final" removed
	
	// Constructors
	public Course(String title, int durationInHours, int maxStudents){
		this.title = title;
		this.durationInHours = durationInHours;
		this.maxStudents = maxStudents;
	}
	
	public Course(String title){
		this.title = title;
		this.maxStudents = 20;
	}
	
	// getter and setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getDurationInHours() {
		return durationInHours;
	}
	
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	
	public void showCourseDetails() {
		System.out.println("Details for "+title);
		System.out.println("Duration: "+durationInHours+ " hours");
		System.out.println("Maximum students allowed: "+maxStudents);
	}
}
