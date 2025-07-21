package JavaPractice;

public class CoreJavaPractice {
	
	static void OddEven(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 0)
				System.out.println(i+" is Even.");
			else
				System.out.println(i+" is Odd.");	
		}		
	}
	
	static int ReverseNumber(int n) {
		
		int reverse=0;
		
		while(n!=0) {
			int temp = n%10;
			reverse = (reverse*10) + temp;
			n = n/10;
		}
		return reverse;
	}
	
	static void PrimeNumber(int p) {
		int count=0;
		for(int i=2; i<= p/2; i++) {
			if(p%i == 0) {
				count++;
			}
		}
		if(count == 0)
			System.out.println(p+" is a prime number");
		else
			System.out.println(p+" is NOT a prime number.");
	}
	
	static void Factorial(int n) {
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" is = "+fact);
	}
	
	static void Fibonacci(int n){
		int a = 0, b = 1;
		int sum=0;
		
		System.out.print("Fibonacci series: "+a+ " "+b+" ");
		for(int i=2; i<n; i++) {
			sum = a+b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
		}
		System.out.println("");
	}
	
	static void ReverseString(String test){
		String reverse = "";
		for(int i = test.length()-1; i>=0; i--) {
			reverse += test.charAt(i);
		}
		
		System.out.println("Reverse String: " +reverse);
	}
	
	static void CheckPalindrome(String test) {
		String reverse = "";
		
		for(int i = test.length()-1; i>=0; i--) {
			reverse += test.charAt(i);
		}
		if(test.equals(reverse)) 
			System.out.println("\"" +test+ "\" is a palindrome.");
		else
			System.out.println("\"" +test+"\" is NOT a palindrome.");
	}
	
	static void VowelConsonantCount(String str) {
		System.out.println("Count Vowels & Consonants of this: "+str);
		int Vowels = 0, Consonants = 0;
		str = str.toLowerCase();
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c) != -1)
					Vowels++;
				else
					Consonants++;
			}
		}
		System.out.println("Number of Vowels: "+Vowels);
		System.out.println("Number of Consonants: "+Consonants);
	}
	
	static void LargestElement(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Maximum number: "+max);
	}
	
	static void SecondLargest(int[] arr) {
		int largestNum = -1, secondLargest = -1;
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			
			if(arr[i]>largestNum) {
				secondLargest = largestNum;
				largestNum = arr[i];
			}
			
			if(arr[i] < largestNum && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest num: "+secondLargest);
	}
	
	public static void main(String[] args) {

		// Odd-Even numbers
		OddEven(35);
		
		// Reverse a number
		int n=1234;
		System.out.println("Number = "+n);
		System.out.println("Reverse Number= "+ReverseNumber(n));
		
		// Check number is Prime or not
		PrimeNumber(29);
		
		// Factorial of number
		Factorial(5);
		
		// Fibonacci series upto N terms
		Fibonacci(13);
		
		// String based programs
		// Reverse a String
		String test = "Test String.";
		ReverseString(test);
		
		// Check if String is Palindrome or not
		String palindrome = "madam";
		CheckPalindrome(test);
		CheckPalindrome(palindrome);
		
		// Count Vowels and Consonants
		String str = "Hello World!";
		VowelConsonantCount(str);
		
		// Array based programs
		// Find largest element in Array
		int[] arr = {1,2,5,47,8,9,12,34,2};
		LargestElement(arr);
		SecondLargest(arr);

	}



}
