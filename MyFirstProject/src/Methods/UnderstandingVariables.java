package Methods;

//Local variable - define inside a method - doesn't have a default value - it requires to be initialized

public class UnderstandingVariables {

	
	int b = 33; 	// Instance variable
	
	static int c = 70; // Static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;		// Local variable
		
		System.out.println("main class Variable a: "+a);
		
		NewMethod();
		
		UnderstandingVariables obj1 = new UnderstandingVariables();
		System.out.println("obj1 call from main class: "+obj1.b);
		System.out.println("Call from main class accessing variables without object creations: "+UnderstandingVariables.c);
	}
	
	public static void NewMethod() {
		
		int a = 22;		// Local variable
		
		System.out.println("NewMethod class Variable a: "+a);
		
		UnderstandingVariables obj1 = new UnderstandingVariables();
		System.out.println("obj1 call from NewMethod class: "+obj1.b);
		System.out.println("Call from NewMethod class accessing variables without object creations: "+UnderstandingVariables.c);
	}

}
