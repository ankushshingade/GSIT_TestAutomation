package UnderstandingArrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class UnderstandingArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Abhilash");
		list.add("Akshada");
		list.add("Ankush");
		list.add("Akshay");
		
//		for(int i =0; i<list.size(); i++)	// Regular for loop
//		{
//			System.out.println(list.get(i));
//		}

//		for(String i: list) 	// Enhanced for loop
//		{
//			System.out.println(i);
//		}

		ListIterator<String> lit = list.listIterator();
		
		while(lit.hasNext()) {
			String var = lit.next();
			System.out.println(var);
			System.out.println(lit.next());
		}
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
			
//		list.add(1, "Anagha");
		
//	ListIterator<String> lit = list.listIterator();
		//lit = list.listIterator();
//		while(lit.hasNext()) {
//			System.out.println(lit.next());
//		}
		
//		while(lit.hasNext()) {
//			String var = lit.next();
//			System.out.println(var);
////			System.out.println(lit.next());
//		}
		}
	}

}
