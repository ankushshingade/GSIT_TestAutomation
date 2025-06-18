package StringManipulation;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Banana";
		
		int n1 = 0;
		
		for(int i=0; i<s1.length(); i++) {
			
			if((s1.charAt(i) == 'a') || (s1.charAt(i) == 'A')) {
				
				n1++;
			}
		}
		
		System.out.println("\"a\" appers for "+n1+ " times.");

	}

}
