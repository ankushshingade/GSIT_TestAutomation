package Loops;

public class DrawRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Draw a nxm rectangle.
		
		int m=6, n=16;
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
