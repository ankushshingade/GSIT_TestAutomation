package UnderstandingInheritance;

class A{
	int a = 10;
	static void newMethod() {
		System.out.println("A's method called.");
	}
}

class B extends A{
	int a = 20;
	static void newMethod() {
		System.out.println("B's method called.");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		A a = new A();
		a.newMethod();
		System.out.println(a.a);
		
		B b = new B();
		b.newMethod();
		System.out.println(b.a);
		
		A c = new B();
		c.newMethod();
		System.out.println(c.a);

	}

}
