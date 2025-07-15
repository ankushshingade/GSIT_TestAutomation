package JavaBasics;



public class app {
	
	class A{
		A()
		{
			System.out.println("A");
		}
	}
		
	class B extends A{
		B()
		{
			System.out.println("B");
		}
	}
	
public static void main(String[] args) {
				
		//B test = new B();
		
	app a = new app();
	B test = a.new B();
//		
//		B b = new B();
//		
		
		
		
	}

}
