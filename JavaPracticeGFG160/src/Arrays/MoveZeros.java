package Arrays;

public class MoveZeros {
	
	static void pushZeroToEnd(int[] arr)
	{
		int l = arr.length;	// Length of arr[]
		
		int count=0;	// track count of non-zero elements
		
		for(int i=0; i<l; i++)
		{
			// If the element is non-zero, replace the element at
	        // index 'count' with this element and increment count
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		// Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
		while(count<l)
		{
			arr[count++]=0;
		}
		
	}
	
	static void moveZeroToEnd(int[] arr)
	{
		int l=arr.length;
		int[] n = new int[l];
		
		int j=0;	// to keep track of index of n[]
				
		for(int i=0; i<l; i++)	// Copy non-zero elements to n[]
		{
			if(arr[i] != 0)
			{
				n[j]=arr[i]; 
				j++;
			}
		}
		while(j < l)	// Fill remaining positions of n[] with zeros.
		{
			n[j] = 0 ;
			j++;
		}
		
		for(int i=0; i<n.length; i++)	// copy n[] into arr[]
			arr[i] = n[i];
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		
		//int[] sorted = {};
		
		moveZeroToEnd(arr);
		System.out.print("Sorted arr: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+", ");
		
		int[] arr2 = {1, 2, 0, 4, 3, 0, 5, 0, 8, 0, 7, 0};
		pushZeroToEnd(arr2);
		System.out.print("Sorted arr2: ");
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i]+", ");

		// https://www.geeksforgeeks.org/dsa/move-zeroes-end-array/
	}

}
