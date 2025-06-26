package UnderstandingAbstraction;

interface A{
	
	default void newMethod() {
		
		System.out.println("New method of interface A is called.");
	}
}

interface B{

	default void newMethod() {
		
		System.out.println("New method of interface B is called.");
	}
}

class C implements A,B{
	
	public void newMethodA() {
		A.super.newMethod();
	}
	
	public void newMethodB() {
		B.super.newMethod();
	}
	
	public void newMethod() {
		
		System.out.println("C's New method is called.");
	}
}
public class DiamondProblem {

	public static void main(String[] args) {
		
		C C1 = new C();
		C1.newMethod();
		
		C1.newMethodA();
		
		C1.newMethodB();
		
		A C2 = new C();
		C2.newMethod();
		
		C2.newMethodA();
		
		C2.newMethodB();

	}

}
