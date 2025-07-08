package Arrays;

public class RotateArray {
	
	static void ArrayRotate(int[] arr, int d)
	{
		int len = arr.length;	// Length of the array
		
		int a=1; // temp variable for comparing 
		
		while(a<=d) {
			
			int first = arr[0];	// temp variable to store first element of array
			
			// Rotate left to 1 position
			for(int i=0; i<len-1; i++) {
				arr[i]=arr[i+1];
			}
			
			arr[len-1] = first;	// substitute first element at the end of the array
			a++;	// 
		}
		
		// Print rotated array
		for(int i=0; i<len-1; i++) {
			System.out.print(arr[i]+", ");
		}
	}

	
	static int[] LeftRotate(int[] arr, int d) {
		
		int len = arr.length;
		
		  // If d >= n, reduce d to a value within the array bounds
        d = d % len;
        
        int i, j, k, temp;
        int g_c_d = gcd(d, len); // Calculate GCD of d and n
        
        // Process each set of elements as per GCD value
        for (i = 0; i < g_c_d; i++) {
          
            // Move i-th element of each block
            temp = arr[i];
            j = i;
            
            while (true) {
                k = j + d; // Calculate index to swap with
                
                // Wrap around if k exceeds array length
                if (k >= len) 
                    k = k - len;
                
                // Break when we complete the cycle for this block
                if (k == i)
                    break;
                
                arr[j] = arr[k]; // Move elements within the set
                j = k;
            }
            arr[j] = temp; // Place initial element at end of cycle
        }
        
    	return arr;
    }

	// Function to calculate GCD of a and b 
	
    static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }

  
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int len = arr.length;
		int d = 12;
		
		for(int i=0; i<(len -1); i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		//ArrayRotate(arr, d);
		
		int[] rotate_arr = LeftRotate(arr, d);
		
		for(int i=0; i<(len -1); i++) {
			System.out.print(rotate_arr[i]+", ");
		}
		
	}

}
