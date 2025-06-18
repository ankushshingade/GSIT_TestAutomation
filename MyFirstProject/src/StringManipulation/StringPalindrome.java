package StringManipulation;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "madam";
		
		String rev = "";
		
		int stringLength = test1.length();
				
		for(int i=stringLength-1; i>=0; i--) {
			
			rev += test1.charAt(i);
		}
		
		if(test1.equals(rev)) {
			
			System.out.println("This is palindrome");
		}
		else
			System.out.println("This is NOT a palindrome");
	}

}
