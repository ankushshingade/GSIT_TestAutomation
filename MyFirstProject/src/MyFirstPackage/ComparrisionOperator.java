package MyFirstPackage;


public class ComparrisionOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
		
		System.out.println("is a equal to b: "+ (a==b));
		System.out.println("is a not equal to b: "+ (a!=b));
		
		// Assignment operators
		
		System.out.println("Current value of a: "+a);
		
		System.out.println("Add & assign: "+ (a += 3));
		System.out.println("Subtract & assign: "+ (a -= 1));
		System.out.println("Multiply & assign: "+ (a *= 9));
		System.out.println("Divide & assign: "+ (a /= 2));
		System.out.println("Remainder & assign: "+ (a %= 7));

	}

}
