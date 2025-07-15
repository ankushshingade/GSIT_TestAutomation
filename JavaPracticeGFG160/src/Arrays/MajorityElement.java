package Arrays;

import java.util.ArrayList;

public class MajorityElement {

public static ArrayList<Integer> findMajority(int[] arr){
	
	int n_3 = arr.length/3;
	System.out.println("arrayLength= "+arr.length);
	System.out.println("ArrayLength/3= "+n_3);
	ArrayList<Integer> ret = new ArrayList<>();
	
	int duplicates = 0;
	for(int i=0; i<(arr.length-1); i++) {
		int a = arr[i];
		
		System.out.println("int a: "+a);
		
		for(int j=0; j<(arr.length-1); j++) {
			if(a==arr[j]) {
				duplicates++;
				}
			}
		if(duplicates >= n_3) {
			System.out.println("Duplicates: "+duplicates);
			
			ret.add(duplicates);
		}
	}
	
	return ret;
}
	
	public static void main(String[] args) {
		// You are given an array of integer arr[] 
		//where each number represents a vote to a candidate. 
		//Return the candidates that have votes greater than one-third 
		//of the total votes, If there's not a majority vote, return an empty array. 

		//Note: The answer should be returned in an increasing format.
		
		int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
		ArrayList<Integer> majorityCheck = findMajority(arr);
		
		System.out.println(majorityCheck);

	}

}
