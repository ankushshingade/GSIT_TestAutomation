package StringManipulation;

public class UnderstandingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		System.out.println(s1);
		// hash-code: memory map co-relation 
		System.out.println(System.identityHashCode(s1)); 
		
		// 1. Using 'new' keyword
		String s2 = new String("Hello");
		System.out.println(s2);
		// hash-code: memory map co-relation 
		System.out.println(System.identityHashCode(s2));
		
		// 2. String length
		System.out.println("length of s2: "+s2.length());
		
		// 3. charAt()
		System.out.println("Char at index 2 is: "+s1.charAt(2));
		
		// 4. substring()
		System.out.println("substring from index 2 onwards: "+s2.substring(2));
		System.out.println("Substring from index 0 till 4 is " + s1.substring(0,4));

		// 5. to upper case & to lower case
		System.out.println("Upper case: "+s1.toUpperCase());
		System.out.println("Lower case: "+s2.toLowerCase());
		
		// 6. trim
		String s3 = "           Hello World!           ";
		System.out.println("Trim s3: "+s3.trim());
		
		// 7. equals() and equalsIgnoreCase()
		System.out.println("s1 equals to hello: "+s1.equals("hello"));
		System.out.println("s1 equalsIgnorCase to hello: "+s1.equalsIgnoreCase("hello"));

		String first = "Hello";
		String second = new String("Hello");
		if(first == second)
			System.out.println(true);
		else
			System.out.println(false);
		
		// 8. contains, startswith, endswith
		System.out.println("s1 contains 'llo': "+s1.contains("llo"));
		System.out.println("s1 starts with 'Hel': "+s1.startsWith("Hel"));
		
		// 9. indexof() & lastindexof()
		System.out.println("Index of 'l' in s1 : "+s1.indexOf('l'));
		System.out.println("Last index of 'l' in s1: "+s1.lastIndexOf('l'));
		
		// 10. replace
		System.out.println("Replace 'o' with 'i': "+s1.replace('o', 'i'));
		System.out.println(s1);
		
		// 11. concatenation
		String s4 = s1 + " " + s2;
		System.out.println(s4);
		System.out.println(s1.concat(" world!"));
		
		// 12. looping through string
		for(int i=0; i<s1.length(); i++) {
			
			System.out.println("Charcter at "+i+" position is "+s1.charAt(i));
		}
		
		// 13. calculate vowels count 
		String s5 = "Checking vowels are present or not aeiou.";
		int count=0;
		for(int i=0; i<s5.length(); i++) {
			
			char currentChar = s5.charAt(i);
			
			if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
				
				count++;
			}
		}
		
		System.out.println("Number of vowels in s5: "+count);
	}

}
