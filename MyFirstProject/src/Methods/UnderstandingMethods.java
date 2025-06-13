package Methods;

public class UnderstandingMethods {
	
	static int doAddition(int a, int b) {
		
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b=20;
		int sumInMain = doAddition(a, b);
		System.out.println("Sum in main method: "+sumInMain);

	}

}
