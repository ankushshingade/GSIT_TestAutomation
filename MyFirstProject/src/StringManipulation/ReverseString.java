package StringManipulation;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		String test1 = "Test";
		
		String rev = "";
		
		int stringLength = test1.length();
		
		System.out.println(stringLength);
		
		for(int i=stringLength-1; i>=0; i--) {
			
			rev += test1.charAt(i);
		}
		System.out.println(rev);
		
		String test2 = "GeeksForGeeks";
		
		for(int i = test2.length()-1; i>=0; i--) {
			System.out.print(test2.charAt(i));
		}
			

	}

}
