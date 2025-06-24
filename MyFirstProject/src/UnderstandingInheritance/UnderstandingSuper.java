package UnderstandingInheritance;

class Parent
{
	int a = 10;
	
	Parent()
	{
		System.out.println("Parent constructor is called.");
	}
	
	Parent(int a)
	{
		this.a = a;
		System.out.println("Parent parameterized constructor is called.");
	}
	
	void NewMethod()
	{
		System.out.println("Parent class method.");
	}
}

class Child extends Parent
{
	int a = 20;
	
	Child()
	{
		System.out.println("Child constructor is called.");
	}
	
	Child(int a)
	{
		super(a);
		this.a = a;
		System.out.println("Child parameterized constructor is called.");
	}
	
	Child(int a, int b)
	{
		super(b);
		this.a = a;
		System.out.println("Child parameterized constructor (two variables) is called.");
		
	}
	
	void NewMethod()
	{
		System.out.println("Child class method.");
	}
	
	void DisplayVariable()
	{
		System.out.println("Child variable: "+this.a);
		System.out.println("Parent variable: "+super.a);	// System.out.println(a);
	}
}
public class UnderstandingSuper {

	public static void main(String[] args) {
		
		Child C1 = new Child();
		
		C1.NewMethod();
		C1.DisplayVariable();
		
		Child C2 = new Child(40);
		C2.DisplayVariable();
		
		Child C3 = new Child(35, 88);
		C3.DisplayVariable();
		
		

	}

}
