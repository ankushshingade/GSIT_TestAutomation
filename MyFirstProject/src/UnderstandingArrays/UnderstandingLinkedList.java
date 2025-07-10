package UnderstandingArrays;

import java.util.LinkedList;

public class UnderstandingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Abhilash"); 		// Add at the end 
		names.addFirst("Anagha");	// Add at the first
		names.addLast("Julien");	// Add at the end
		names.add(1, "Hemanth");	// Add at specific index
		
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("======================");
		
		System.out.println(names.size());
		String name = names.get(1);			// Get data from 1st index
		String first = names.getFirst();	// Get data from start
		
		System.out.println(name);
		System.out.println(first);
		
		System.out.println(names.remove());
		System.out.println(names.remove(2));
		
	}

}
