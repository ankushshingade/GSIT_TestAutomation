package JavaBasics;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder test = new StringBuilder("StringBuilder.");
		// As String objects are immutable we preferred to use StringBuilder which is mutable and have 
		//various String manipulation methods easily available.
		// StringBuilder is faster and provides same String manipulation methods as that of StringBuffer 
		System.out.println("===========================================");
		StringBuilder test1 = new StringBuilder("StringBuilder.");
		System.out.println("test1: "+test1);
		System.out.println("Capacity: "+test1.capacity());
		System.out.println("ChatAt(6): "+test1.charAt(6));
		System.out.println("Unicode at index(6): "+test1.codePointAt(6));
		System.out.println("Unicode at before index(6): "+test1.codePointBefore(6));
		System.out.println(test1.codePointCount(0, 13));
		System.out.println(test1.compareTo(test));
		System.out.println("Equals (Boolean): "+test1.equals(test));
		System.out.println("HashCode: "+test1.hashCode());
		System.out.println("Index of sub-string: "+test1.indexOf("in"));
		System.out.println("Is Empty: "+test1.isEmpty());
		System.out.println("Length: "+test1.length());
		System.out.println(test1.append("+append"));
		System.out.println(test1.replace(14, 21, " Replace"));
		
		System.out.println("===========================================");
		// Thread safe implementation of StringBuilder
		StringBuffer s1 = new StringBuffer("ANKUSH"); 
		
		//s1.append(true);
		
		System.out.println(s1);

	}

}
