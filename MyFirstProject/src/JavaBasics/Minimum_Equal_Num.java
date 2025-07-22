package JavaBasics;

import java.util.LinkedList;

public class Minimum_Equal_Num {

	public static void main(String[] args) {
		int[] arr = {45, 890, 89, 123, 345, 7890, 'a', 678, 80, 12, 56, 78, 120, 11, 67, 76, 66,12, 345, 67, 12};		// it should be linked list
		LinkedList<String> List1 = new LinkedList<>{45, 890, 89, 123, 345, 7890, 'a', 678, 80, 12, 56, 78, 120, 11, 67, 76, 66,12, 345, 67, 12};
		int min = arr[0];
		//int eq =0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum num: "+min);
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				
				if(i!=j) 
				{
					
					if(arr[i] == arr[j]) {
						//eq = arr[j];
						System.out.println("Equal num: "+arr[j]);
					}
				}
			}
		}

	}

}
