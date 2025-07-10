package UnderstandingArrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UnderstandingStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");	// Top
		
		System.out.println(stack);	// [A, B, C]
		
		System.out.println("Peek: "+stack.peek());	// C
		
		System.out.println("Pop: "+stack.pop());	// C
				
		System.out.println(stack);	// [A, B]
		
		System.out.println("Search: "+stack.search("A"));	// Counting starts from Top
		
		stack.push("C");
		stack.push("A");
		
		System.out.println(stack);	
		
		System.out.println("Search: "+stack.search("A"));
		
		System.out.println("Size of stack: "+stack.size());
		
		Deque<String> stack2 = new ArrayDeque<>();
		
		
	}

}
