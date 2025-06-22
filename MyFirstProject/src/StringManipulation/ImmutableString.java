package StringManipulation;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		System.out.println("s1 == s2 : "+(s1==s2));
		System.out.println("s1 == s3 : "+(s1==s3));
		System.out.println("s2.equals(s3) : "+(s2.equals(s3)));
		
		/* 
		 * In Java, you can't directly access the memory address of a String (or any object) 
		 * like you can in languages such as C or C++. 
		 * Java abstracts memory management through the JVM, 
		 * so what you get is a reference, not the actual memory address.
		 * 
		 * This gives you a hash code that often correlates with the memory address, 
		 * but it's not guaranteed to be the actual address.
		 */
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		String s4 = "Hello";
		s4 = "Hello world!";
		System.out.println(s4);
		
		String s5 = "Hello";
		s5.concat(" world!");	// concatenation will not change value/string unless s5 = s5.concat(" world!");
//		s5 = s5.concat(" world!");
		System.out.println(s5);

	}

}
