package StringManipulation;

import java.util.Scanner;

public class UnderstandingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter a float number: ");
		float f1 = sc.nextFloat();
		
		System.out.print("Enter a double number: ");
		double d1 = sc.nextDouble();
		
		System.out.print("Enter a boolean value (true/false): ");
		// Boolean values should be "true/false" anything else will throw an error.
		boolean b1 = sc.nextBoolean();
		
		sc.nextLine();
		
		System.out.print("Enter a name: ");
		String s1 = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter a string line: ");
		String s2 = sc.nextLine();
		
		sc.close();
		
		System.out.println("Age: "+n1);
		System.out.println("Float number: "+f1);
		System.out.println("Double number: "+d1);
		System.out.println("Boolean: "+b1);
		System.out.println("First name: "+s1);
		System.out.println("String line: "+s2);

	}

}
