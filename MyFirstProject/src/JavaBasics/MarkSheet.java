package JavaBasics;

public class MarkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math = 86;
		int sci = 88;
		int engl = 82;
		
		byte a=10, b=20, c=5;
		
		int d=a+b+c;
		System.out.println(d);
		System.out.println("Byte"+ (byte)d);
		
		int totalMarks = math + sci + engl;
		
		System.out.println("Total marks = "+totalMarks);
		
		double avgMarks = totalMarks/3.0;
		
		float avgMarks2 = totalMarks/3.0f;
		
		System.out.println("Average marks stored in double = "+ avgMarks);
		
		System.out.println("Average marks stored in float = "+ avgMarks2);
		

	}

}
