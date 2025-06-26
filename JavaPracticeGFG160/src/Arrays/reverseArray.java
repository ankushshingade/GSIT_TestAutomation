package Arrays;

public class reverseArray {

	static void arrayReverse(int[] arr)
	{
		int len = arr.length, j=0;
		
		int[] temp = new int[len];
		
		for(int i=len-1; i>=0; i--)
		{
			temp[j++] = arr[i];
		}
		
		for(int i=0; i<len; i++)
			arr[i] = temp[i];
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 6, 5};
		
		for(int i:arr)
			System.out.print(i+ " ");
		
		System.out.println();
		arrayReverse(arr);
		
		for(int i:arr)
			System.out.print(i+ " ");
		
		// https://www.geeksforgeeks.org/java/reverse-an-array-in-java/

	}

}
