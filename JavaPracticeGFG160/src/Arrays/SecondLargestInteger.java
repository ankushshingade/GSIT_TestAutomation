package Arrays;

import java.util.Arrays;

public class SecondLargestInteger {

	static int getSecondLargest0(int[] arr)
	{
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for(int i=n-2; i>=0; i--)
		{
			if(arr[i]!=arr[n-1])
			{
				return arr[i];
				
			}
		}
		return -1;
	}
	
	static int getSecondLargest1(int[] arr)
	{
		int largest=-1, secondLargest=-1;
		int n=arr.length;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				secondLargest = largest;	// replace secondLargest with largest
				largest = arr[i];			// replace largest with current largest
			}
			
			else if(arr[i]<largest && arr[i]>secondLargest) // for number greater than secondLargest but smaller than largest
			{
				secondLargest = arr[i];		// replace it with secondLargest
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,35,1,10,34,1};

		int secondLargest = getSecondLargest0(arr);
		System.out.println("SecondLargest int: "+secondLargest);
		
		int[] arr2 = {87, 65, 99, 72, 78, 63, 82, 987, 176};
		secondLargest = getSecondLargest1(arr2);
		System.out.println("SecondLargest int: "+secondLargest);		

		// https://www.geeksforgeeks.org/dsa/find-second-largest-element-array/
	}

}
