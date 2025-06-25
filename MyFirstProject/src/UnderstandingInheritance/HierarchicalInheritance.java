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

class Square extends Shapes
{
	void area()
	{
		System.out.println("Area of Square.");
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
		
		Square Re = new Square();
		Re.area();
		
		Circle Ci = new Circle();
		Ci.area();
		
		Shapes Sh = new Shapes();
		Sh.area();

	}

}
