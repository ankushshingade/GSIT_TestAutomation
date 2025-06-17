package StringManipulation;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hi, How are you today?";
		
		int numVowels = 0;
		
		for(int i=0; i<(s1.length()-1); i++) {
			
			if((s1.charAt(i) == 'a') || (s1.charAt(i) == 'A')) {
				
				numVowels++;
			}
			else if((s1.charAt(i) == 'e') || (s1.charAt(i) == 'E')) {
				
				numVowels++;
			}
			else if((s1.charAt(i) == 'i') || (s1.charAt(i) == 'I')) {
				
				numVowels++;
			}
			else if((s1.charAt(i) == 'o') || (s1.charAt(i) == 'O')) {
				
				numVowels++;
			}
			else if((s1.charAt(i) == 'u') || (s1.charAt(i) == 'U')) {
				
				numVowels++;
			}
		}
		
		System.out.println(numVowels);

	}

}
