package UnderstandingArrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class UnderstandingQueueDeque {

	public static void main(String[] args) {

		Queue<String> fruits = new LinkedList<>();	// First in First out
		
		fruits.add("Apple");	// Add 
		fruits.offer("Banana");	// Add, efficient than ".add"
		fruits.offer("Strawberry");
		fruits.offer("Mango");
		
		System.out.println(fruits.toString());	// String representation of object
		
		System.out.println("Peek: "+fruits.peek());	// Apple
		System.out.println("isEmpty?: "+fruits.isEmpty());	// false
		System.out.println("Is Kiwi available? "+fruits.contains("kiwi"));	// false
		System.out.println("Is Mango available? "+fruits.contains("Mango"));	// true
		System.out.println("Size of queue: "+fruits.size()); 	// 4
		System.out.println("Poll: "+fruits.poll());	// Apple (remove Apple)
		System.out.println("Size of queue: "+fruits.size()); 	// 3
		
		System.out.println("==================================");
		Deque<String> students = new LinkedList<>();
		
		students.add("Omkar");
		students.offer("Ankush");
		
		System.out.println("Deque: "+students.toString());
		
		students.addFirst("Akshata");
		students.addLast("Hari");
		System.out.println("Deque: "+students.toString()); 
		System.out.println("Size of Deque: "+students.size());	
		System.out.println("Get first: "+students.getFirst());
		System.out.println("Get last: "+students.getLast());
		System.out.println("Remove 'Ankush': "+students.remove("Ankush"));
		System.out.println("Contains 'Ankush'?: "+students.contains("Ankush"));
		System.out.println("Remove first: "+students.removeFirst());
		System.out.println("Remove last: "+students.removeLast());
	}

}
