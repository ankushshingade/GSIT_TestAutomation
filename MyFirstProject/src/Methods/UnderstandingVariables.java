package Methods;

public class UnderstandingVariables {

	
	int b = 33; 	// Instance variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;		// Local variable
		
		System.out.println(a);
		
		NewMethod();
		
		UnderstandingVariables obj1 = new UnderstandingVariables();
		System.out.println(obj1.b);
	}
	
	public static void NewMethod() {
		
		int a = 22;		// Local variable
		
		System.out.println(a);
	}

}
