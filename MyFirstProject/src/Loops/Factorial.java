package Loops;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int factorial=1;
		
		while(a!=0) {
			factorial = factorial * a;
			a--;
		}
		
		System.out.println("Factorial = "+factorial);

	}

}
