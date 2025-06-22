package Methods;

class NewClass{
	
	int a = 20; 		// Instance variable
	static int b = 40; 	// Static variable
	
}
public class UnderstandingStaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewClass Obj1 = new NewClass();
		System.out.println("Obj1.a: "+Obj1.a);
		System.out.println("Obj1.b: "+Obj1.b);
		
		NewClass Obj2 = new NewClass();
		System.out.println("Obj2.a: "+Obj2.a);
		System.out.println("Obj2.b: "+Obj2.b);
		
		Obj1.b = 55;
		System.out.println("Obj1.b: "+Obj1.b);
		System.out.println("Obj2.b: "+Obj2.b);
		
		Obj2.a = 88;
		System.out.println("Obj1.a: "+Obj1.a);
		System.out.println("Obj2.a: "+Obj2.a);
		

	}

}
