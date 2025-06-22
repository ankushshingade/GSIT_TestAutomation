package ObjectOrientedProgramming;

class Student2
{
	String name;
	int age;
	static int studentsCount;
	
	Student2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	Student2()
	{
		this("Shivam",27);
	}
	
	void printInfo()
	{
		System.out.println(name + " " + age);
	}
	
	void callPrintInfoMethod()
	{
		printInfoMethod(this);
		
	}
	
	void printInfoMethod(Student2 obj)
	{
		System.out.println(this.name + " " + this.age );
	}
	
	static void newStaticMethod()
	{
		System.out.println(studentsCount);
		System.out.println("Static method called");
	}
	
}

public class UnderstandingThis {

	public static void main(String[] args) {

		Student2 S1 = new Student2("Anagha",26);
		S1.printInfo();
		
		Student2 S2 = new Student2();
		S2.printInfo();
		
		Student2 S3 = new Student2("Julien", 28);
		S3.callPrintInfoMethod();
		
		Student2 S4 = new Student2();
		Student2.studentsCount = 4;
		
		System.out.println(Student2.studentsCount);
		
		Student2.newStaticMethod();
		

	}

}
