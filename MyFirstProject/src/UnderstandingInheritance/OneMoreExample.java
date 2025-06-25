package UnderstandingInheritance;

class Rectangle
{
	int l, b;
	
	Rectangle()
	{
		System.out.println("Non Parameterized constructor of Parent is called.");
		this.l = 1;
		this.b = 1;
	}
	
	Rectangle(int l, int b)
	{
		System.out.println("Parameterized constructor of Parent is called.");
		this.l = l;
		this.b = b;
	}
}

class RectangleWithWeight extends Rectangle
{
	int w;
	
	RectangleWithWeight()
	{
		System.out.println("Non Parameterized constructor of Child is called.");
		w = 1;
	}
	
	RectangleWithWeight(int l, int b, int w)
	{
//		this.l = l;
//		this.b = b;
		super(l,b);
		System.out.println("Parameterized constructor of Child is called.");
		this.w = w;
		
	}
	
}

public class OneMoreExample {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
		System.out.println(R1.l+ " " +R1.b);
		
		RectangleWithWeight RW1 = new RectangleWithWeight(2,3,4);
		System.out.println(RW1.l+ " " +RW1.b+ " " +RW1.w);

	}

}
