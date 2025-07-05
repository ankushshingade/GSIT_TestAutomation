package Main;
import User.Student;
//import User.User;
import User.Instructor;

public class Main {

	public static void main(String[] args) {

		Student S1 = new Student("Ankush", "test@gmail.com", "1234");
		Student S2 = new Student("Shreeya", "test2@gmail.in", "5678");
		
		Instructor I1 = new Instructor("Sandesh", "sandesh@gsit.com", "1122");
		Instructor I2 = new Instructor("Hema", "hema@gsit.com", "3344");
		
		I1.createCourse("Automation Testing");
		I1.createCourse("Advanced Java");
		I2.createCourse("Manual Testing");
		I2.createCourse("Python");
		S1.enrollCourse("Automation Testing");
		S1.enrollCourse("Python");
		S2.enrollCourse("Advanced Java");
		S2.enrollCourse("Manual Testing");
		S2.enrollCourse("Automation Testing");
		S1.enrollCourse("DevOps");
		System.out.println("Course List: "+I1.getCourseList());
		

	}

}
