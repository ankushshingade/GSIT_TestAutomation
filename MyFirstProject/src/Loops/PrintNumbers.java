package Loops;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++) {
			
			if(i%5 == 0) continue;
			
			System.out.println(i);
		}

	}

}
