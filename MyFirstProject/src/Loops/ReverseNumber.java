package Loops;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123456789;
		
		
		  String numString = Integer.toString(num);
		  
		  
		  System.out.println(numString);
		  
		  int numLength = numString.length();
		  
		  System.out.println(numLength);
		  
		  int[] numArray = new int[numLength] ;
		  
		  for(int i=0; i<numLength; i++) { numArray[i] = (num%10); num = num/10; }
		  
		  int reverseNum=0; for(int i=0; i<numLength; i++) { reverseNum =
		  (reverseNum*10)+numArray[i];
		  
		  }
		  
		  System.out.println(reverseNum);
		 
		 
		int reverseNum2=0;
		
		while(num!=0) {
			reverseNum2 = (reverseNum2 * 10) + (num%10);
			num = num/10;
		}
		
		System.out.println(reverseNum2);
		

	}

}
