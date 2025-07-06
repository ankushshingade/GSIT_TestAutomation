package Main;
import User.Student;
//import User.User;
import User.Instructor;
import User.Course;

public class Main {

	public static void main(String[] args) {

		// Create Admin profile
		
		
		// Create Instructor profiles
		Instructor I1 = new Instructor("Sandesh", "sandesh@gsit.com", "1122");
		I1.createCourse("Automation Testing");
		I1.updateCourseDetails("Automation Testing", 128, 50);
		I1.createCourse("Advance Java");
		I1.updateCourseDetails("Advance Java", 58, 50);
		
		Instructor I2 = new Instructor("Hema", "hema@gsit.com", "3344");		
		I2.createCourse("Manual Testing");
		I2.updateCourseDetails("Manual Testing", 55, 50);
		I2.createCourse("Python");
		I2.updateCourseDetails("Python", 85, 50);
		
		// Create Students profiles
		Student S1 = new Student("Ankush", "test@gmail.com", "1234");
		S1.enrollCourse("Automation Testing");
		S1.enrollCourse("Python");
		S1.enrollCourse("DevOps");
		
		Student S2 = new Student("Shreeya", "test2@gmail.in", "5678");
		S2.enrollCourse("Advanced Java");
		S2.enrollCourse("Manual Testing");
		S2.enrollCourse("Automation Testing");
		
		
		
		
		System.out.println("Course List: "+I1.getCourseList());
		

	}

}
