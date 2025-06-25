package UnderstandingInheritance;

class Calculator
{
	int add(int a, int b)
	{
		System.out.print("int: ");
		int sum = a + b;
		return sum;
	}
	
	double add(double a, double b)
	{
		System.out.print("double: ");
		return (a+b);
	}
	
	int add(int a, int b, int c)
	{
		System.out.print("3 int: ");
		return (a+b+c);
	}
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		Calculator Calc = new Calculator();
		
		System.out.println(Calc.add(8, 3));
		
		System.out.println(Calc.add(5.5, 6.6));
		
		System.out.println(Calc.add(28, 5, 20));

	}

}
