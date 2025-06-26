package Arrays;

public class RotateArray {
	
//	static void ArrayRotate(int[] arr, int d)
//	{
//		
//	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int d = 2;
		
		int len = arr.length;
		
		d %= len;
		
		System.out.println(len);

	}

}
