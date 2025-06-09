package ConditionalStatements;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age1 = 25;
	  
		if(age1>18) { System.out.println("Adult"); }
		 
		
		
		int age2 = 7;
	  
		if(age2>18) System.out.println("Adult"); 
		else System.out.println("Minor");
		 
		
		int age3 = 15;
		
		if(age3>=18) {
			System.out.println("Adult");
		}
		else if(age3>=13){
			System.out.println("Teenage");
		}
		else {
			System.out.println("Minor");
		}
		
		int age4 = 16;
		
		String result = (age4>=18)? "Adult" : "Minor";
		
		System.out.println(result);
		

	}

}
