package Arrays;

public class NextPermutation {
	
	static int[] nextPermutation(int[] arr) {
		 int len = arr.length;
	        int i=0;
	        
	        if(len==1){
	            return arr;
	        }
	        
	        for(i=len-1; i>0; i--){
	            if(arr[i]>arr[i-1]){
	                break;
	            }
	        }
	        
	        System.out.println("i: "+i);
	        if(i==0){
	        	return arr;	            
	        }
	        
	        for(int j=len-1; j>=i; j--) {
	        	if(arr[i-1] < arr[j]) {
	        		int temp = arr[i-1];
	        		arr[i-1] = arr[j];
	        		arr[j] = temp;
	        		break;
	        	}
	        }
	        return arr;
	}


	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 6, 5, 4};		// {2, 4, 1, 7, 5, 0} {5,3,4,9,7,6} {1,2,3,4,5,6,7,8}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}	
		System.out.println("");
		int[] new_arr = nextPermutation(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(new_arr[i]);
		}
	}

}
