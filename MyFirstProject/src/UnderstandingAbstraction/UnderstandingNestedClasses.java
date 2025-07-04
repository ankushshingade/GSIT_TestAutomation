package UnderstandingAbstraction;

public class UnderstandingNestedClasses {

	int x =10;
	static int y=20;
	
	class NewClass		// Non static nested class
	{
		void NewMethod() {
			System.out.println("NewClass method called from nested NewClass.");
		}
	}
	
	static class NewStaticClass	// Static nested class
	{
		static void NewMethod2() {
			System.out.println("Static method called: Y = "+y);
		}
		
		void NewMethod3() {
			System.out.println("Non-static method called: Y = "+y);
		}
	}
	
	public static void main(String[] args) {

		UnderstandingNestedClasses Obj = new UnderstandingNestedClasses();
		UnderstandingNestedClasses.NewClass Obj2 = Obj.new NewClass();
	}

}
