package UnderstandingAbstraction;

public class PersonClass {
	
	private String name = "Ankush";	// Private
	public String city = "Pune";	// Public
	protected int age = 38;			// Protected
	String ID = "12345";			// Default

	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
		System.out.println("ID: "+ID);
	}
	
	
	public static void main(String[] args) {


	}

}
