package User;

public class Instructor extends User {

	private String createdCourse1;
	private String createdCourse2;
	
    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
        this.createdCourse1 = null;
        this.createdCourse2 = null;
        
        displayWelcome();
    }
    
 // Getters and Setters
    public String getCreatedCourse1() {
        return createdCourse1;
    }

    public void setCreatedCourse1(String createdCourse1) {
        this.createdCourse1 = createdCourse1;
    }

    public String getCreatedCourse2() {
        return createdCourse2;
    }

    public void setCreatedCourse2(String createdCourse2) {
        this.createdCourse2 = createdCourse2;
    }

// Method to create a course	
	public void createCourse(String courseName, int durationInHoyrs, int maxStudents) {
		
		 if (createdCourse1 == null) {
	            createdCourse1 = courseName;
	            System.out.println(getName()+" Created \"" + courseName+ "\" course.");
	            setCourseList(courseName);
	        } else if (createdCourse2 == null) {
	            createdCourse2 = courseName;
	            System.out.println(getName()+" Created \"" + courseName+ "\" course.");
	            setCourseList(courseName);
	        } else {
	            System.out.println("Cannot create more than 2 courses per Instructor : Maximum courses (2) already created.");
	        }
		
	}
	
	
	@Override
	public void viewProfile() {
		System.out.println("Instrctor Profile: ");
		System.out.println("Instructor name: "+getName());
		System.out.println("Instructor email: "+getEmail());
		System.out.println("Instructor userID: "+getUserID());	
		System.out.println("Created Courses: " + 
	            (createdCourse1 != null ? createdCourse1 : "None") + ", " + 
	            (createdCourse2 != null ? createdCourse2 : "None"));
		
	}
	
}
