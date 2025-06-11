package Loops;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12345;
		int sum = 0;
		
		while(a!=0) {
			
			sum = sum + (a%10);
			a = a/10;
		}
		System.out.println(sum);

	}

}
