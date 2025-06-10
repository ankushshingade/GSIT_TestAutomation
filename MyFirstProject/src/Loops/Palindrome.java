package Loops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 121;
		
		int num2 = num1;
		
		int reverseNum = 0;
		
		while(num1!=0) {
			reverseNum = (reverseNum * 10) + (num1%10);
			num1 = num1/10;
		}
		
		if(reverseNum == num2)
			System.out.println("Given number "+num2+" is a palindrome.");
		else
			System.out.println("Given number "+num2+" is NOT a pallindrome.");

	}

}
