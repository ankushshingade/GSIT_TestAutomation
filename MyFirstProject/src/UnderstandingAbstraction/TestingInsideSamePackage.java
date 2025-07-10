package UnderstandingAbstraction;

public class TestingInsideSamePackage {

	public static void main(String[] args) {

		PersonClass P1 = new PersonClass();
		
		//System.out.println("Name: "+P1.name);	// Private is not visible in same package, different class
		System.out.println("City: "+P1.city);	// Public works
		System.out.println("Age: "+P1.age);		// Protected works
		System.out.println("ID: "+P1.ID);		// Default works

		P1.printDetails();
	}

}
