package User;

public class Admin extends User {
	
public Admin(String name, String email, String userId) {
	super(name, email, userId);
	displayWelcome();
	
}

public void removeProfile(String name) {
	System.out.println("\""+name+"\" this profile is removed.");
}

	@Override
	void viewProfile() {
		System.out.println("Admin Profile: ");
		System.out.println("Admin name: "+getName());
		System.out.println("Admin email: "+getEmail());
		System.out.println("Admin userID: "+getUserID());	
		
	}
	
}

