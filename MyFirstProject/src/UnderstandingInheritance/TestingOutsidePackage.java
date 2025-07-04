package UnderstandingInheritance;

import UnderstandingAbstraction.PersonClass;

public class TestingOutsidePackage extends PersonClass{
	
	void access() {
		
		// when claas is inherited following are accessible without creating object 
		
//		System.out.println("Name: "+name);	// Private - only accessible inside class
		System.out.println("City: "+city);	// Public accessible
		System.out.println("Age: "+age);	// Protected accessible outside package if class is inherited.
//		System.out.println("ID: "+ID);		// Default - Package private
	}

	public static void main(String[] args) {

		PersonClass P2 = new PersonClass();
		
//		System.out.println("Name: "+P2.name);	// Private not working
		System.out.println("City: "+P2.city);	// Public works
//		System.out.println("Age: "+P2.age);		// Protected not working
//		System.out.println("ID: "+P2.ID);		// Default not working
		
		P2.printDetails();	// Public method can access all details in that class.
		

	}

}
