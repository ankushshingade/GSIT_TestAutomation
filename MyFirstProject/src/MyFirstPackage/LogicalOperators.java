package MyFirstPackage;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20, c=30, d=15;
		
		boolean value = (a>b) && (c>d);
		
		System.out.println("(a>b) && (c>d): "+value);
		System.out.println("(a>b) && (c<d): "+ (value=(a>b) && (c<d)));
		System.out.println("(a<b) && (c<d): "+ (value=(a<b) && (c<d)));
		System.out.println("(a<b) && (c>d): "+ (value=(a<b) && (c>d)));
		System.out.println("");
		System.out.println("(a>b) || (c>d): "+(value = (a>b) || (c>d)));
		System.out.println("(a>b) || (c<d): "+ (value=(a>b) || (c<d)));
		System.out.println("(a<b) || (c<d): "+ (value=(a<b) || (c<d)));
		System.out.println("(a<b) || (c>d): "+ (value=(a<b) || (c>d)));

	}

}
