package Main;
import User.Student;
//import User.User;
import User.Instructor;
import User.Admin;
import User.Course;

public class Main {

	public static void main(String[] args) {

		// Create Admin profile
		Admin A1 = new Admin("Akanksha", "aks@gsit.com", "AD0001");
		
		// Create Instructor profiles
		Instructor I1 = new Instructor("Sandesh", "sandesh@gsit.com", "IN0001");
		I1.createCourse("Automation Testing");
		I1.updateCourseDetails("Automation Testing", 128, 50); // Update an ArrayList<Course>
		Course automationTesting = new Course("Automation Testing", 128, 50);
		I1.createCourse("Advance Java");
		I1.updateCourseDetails("Advance Java", 58, 50); // Update an ArrayList<Course>
		Course advanceJava = new Course("Advance Java", 58, 50);
		
		Instructor I2 = new Instructor("Hema", "hema@gsit.com", "IN0002");		
		I2.createCourse("Manual Testing");
		I2.updateCourseDetails("Manual Testing", 55, 50); // Update an ArrayList<Course>
		Course manualTesting = new Course("Manual Testing", 55, 50);
		I2.createCourse("Python");
		I2.updateCourseDetails("Python", 85, 50); // Update an ArrayList<Course>
		Course python = new Course("Python", 85, 50);
		
		// Course list
		System.out.println("Course List: "+I1.getCourseList());
		// Show course details
		
		automationTesting.showCourseDetails();
		
		advanceJava.showCourseDetails();
		
		manualTesting.showCourseDetails();
		
		python.showCourseDetails();
		
		
		// Create Students profiles
		Student S1 = new Student("Ankush", "test@gmail.com", "ST25001");
		S1.enrollCourse("Automation Testing");
		S1.setTrackProgressCourse1(40);
		S1.enrollCourse("Python");
		S1.setTrackProgressCourse2(50);
		S1.enrollCourse("DevOps");
		S1.trackProgress();
		
		Student S2 = new Student("Shreeya", "test2@gmail.in", "ST25002");
		S2.enrollCourse("Advanced Java");
		S2.setTrackProgressCourse1(45);
		S2.enrollCourse("Manual Testing");
		S2.setTrackProgressCourse2(65);
		S2.enrollCourse("Automation Testing");
		S2.trackProgress();
		
		// Admin remove a profile
		A1.removeProfile("Ankush");
		
				
		

	}

}
