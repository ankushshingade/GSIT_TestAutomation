package Loops;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7654982;
		int digit=0;
		
		while(a!=0) {
			digit++;
			a = a/10;
		}
		
		System.out.println(digit);

	}

}
