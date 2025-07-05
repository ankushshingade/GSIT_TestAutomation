package User;

public class Admin extends User {

	@Override
	void viewProfile() {
		System.out.println("Admin Profile: ");
		System.out.println("Admin name: "+getName());
		System.out.println("Admin email: "+getEmail());
		System.out.println("Admin userID: "+getUserID());	
		
	}
	
}

