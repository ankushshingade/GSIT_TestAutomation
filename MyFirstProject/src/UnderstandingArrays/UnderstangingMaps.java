package UnderstandingArrays;

import java.util.HashMap;
import java.util.Map;

public class UnderstangingMaps {

	public static void main(String[] args) {
		Map<String, Integer> hashMap1 = new HashMap<>(); 

		hashMap1.put("Shivam", 27);
		hashMap1.put("Anagha", 30);
		hashMap1.put("Akshay", 28);
		
		System.out.println(hashMap1.get("Shivam"));	// 27
		
		System.out.println(hashMap1.containsKey("Anagha"));	// true
		System.out.println(hashMap1.containsValue(33));		// false
		System.out.println(hashMap1.isEmpty());				// false
		System.out.println(hashMap1.remove("Shivam"));		// 27
		System.out.println(hashMap1.size());				// 2
		
		System.out.println("Java".equals(new String ("Java")));
		System.out.println(hashMap1.size());
		

		
		
		

	}

}
