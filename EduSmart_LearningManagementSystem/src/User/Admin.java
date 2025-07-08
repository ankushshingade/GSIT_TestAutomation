package User;

public class Admin extends User {
	
public Admin(String name, String email, String userId) {
	super(name, email, userId);
	displayWelcome();
	
}

public void removeProfile(String name) {
	System.out.println("------------------------------------------------");
	System.out.println("Admin "+getName()+" initiated removal of profile.");
	System.out.println("\""+name+"\" profile is removed.");
	System.out.println("------------------------------------------------");
}

	@Override
	void viewProfile() {
		System.out.println("Admin Profile: ");
		System.out.println("Admin name: "+getName());
		System.out.println("Admin email: "+getEmail());
		System.out.println("Admin userID: "+getUserID());	
		
	}
	
}

