package UnderstandingInheritance;

class Shapes
{
	void area()
	{
		System.out.println("Area of Shape.");
	}
}

class Circle extends Shapes
{
	void area()
	{
		System.out.println("Area of Circle.");
	}
}

class Rectangle extends Shapes
{
	void area()
	{
		System.out.println("Area of Rectangle.");
	}
}

class Elipse extends Shapes
{
	void area()
	{
		System.out.println("Area of Elipse.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Elipse El = new Elipse();
		El.area();
		
		Rectangle Re = new Rectangle();
		Re.area();
		
		Circle Ci = new Circle();
		Ci.area();
		
		Shapes Sh = new Shapes();
		Sh.area();

	}

}
