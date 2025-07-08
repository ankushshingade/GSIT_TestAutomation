package User;


import java.util.ArrayList;

public class Student extends User implements ProgressTrackable{

	private String enrolledCourse1;
	private String enrolledCourse2;
	private int trackProgressCourse1;
	private int trackProgressCourse2;
	private ArrayList<String> courseListStudents = getCourseList();
	
    public Student(String name, String email, String userId) {
        super(name, email, userId);
        this.enrolledCourse1 = null;
        this.enrolledCourse2 = null;
        
        displayWelcome();
    }
    
 // Getters and Setters
    public String getEnrolledCourse1() {
        return enrolledCourse1;
    }

    public void setEnrolledCourse1(String enrolledCourse1) {
        this.enrolledCourse1 = enrolledCourse1;
    }

    public String getEnrolledCourse2() {
        return enrolledCourse2;
    }

    public void setEnrolledCourse2(String enrolledCourse2) {
        this.enrolledCourse2 = enrolledCourse2;
    }
    
	public int getTrackProgressCourse1() {
		return trackProgressCourse1;
	}

	public void setTrackProgressCourse1(int trackProgressCourse1) {
		this.trackProgressCourse1 = trackProgressCourse1;
	}

	public int getTrackProgressCourse2() {
		return trackProgressCourse2;
	}

	public void setTrackProgressCourse2(int trackProgressCourse2) {
		this.trackProgressCourse2 = trackProgressCourse2;
	}

    // Method to enroll in a course
    public void enrollCourse(String courseName) {
        if (enrolledCourse1 == null) {
        	if(courseListStudents.contains(courseName)) {
        		 enrolledCourse1 = courseName;
        	}
            System.out.println(getName()+" enrolled in course: " + courseName);
        } else if (enrolledCourse2 == null) {
        	if(courseListStudents.contains(courseName)) {
       		 enrolledCourse2 = courseName;
       	}
            System.out.println(getName()+" enrolled in course: " + courseName);
        } else {
        	if(courseListStudents.contains(courseName)) {
        		System.out.println("Cannot enroll: Maximum courses (2) already enrolled.");
        	}
        	else
        		System.out.println("\""+courseName+ "\" Course is not available.");
            
        }
    }
	
	
//	public void enrollCourse(String courseName) {
//		if (enrolledCourse1 == null) {
//			for(Course courses:Course. )
//		}
//	}

	
	@Override
	public void viewProfile() {
		System.out.println("Student Profile:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("User ID: " + getUserID());
        System.out.println("Enrolled Courses: " + 
            (enrolledCourse1 != null ? enrolledCourse1 : "None") + ", " + 
            (enrolledCourse2 != null ? enrolledCourse2 : "None"));

	}
	

    // Implement trackProgress
	@Override
	public void trackProgress() {
		System.out.println("Tracking progress for student: "+getName());
		System.out.println("Progress in "+getEnrolledCourse1()+": "+getTrackProgressCourse1()+"%");
		System.out.println("Progress in "+getEnrolledCourse2()+": "+getTrackProgressCourse2()+"%");
		
	}


	
}

