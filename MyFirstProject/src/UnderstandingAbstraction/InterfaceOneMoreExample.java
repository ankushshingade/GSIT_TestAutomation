package UnderstandingAbstraction;


// Public methods inside interfaces is possible - by default all methods are public in interfaces.
// Private methods inside interfaces - possible.
// Protected methods inside interfaces - Not allowed. 
// Default methods - not possible.
// Static methods - possible.
// Static abstract methods - not possible.
// Final abstract methods - not possible.


interface Payment{
	
	void makePayment(double amount);
	
	default void publicMethod() {
		
	}
	
	private void privateMethod() {
		System.out.println("Private method from interface.");
	}
	
//	protected void protectedMethod() {
//		
//	}
	
	static void staticMethod() {
		System.out.println("Static method from interface.");
	}
}

class CreditCardPayment implements Payment{

	@Override
	public void makePayment(double amount) {
		
		System.out.println("Payment of amount "+amount+" done using Credit card.");
		
	}
}

class UpiPayment implements Payment{
	
	@Override
	public void makePayment(double amount) {
		
		System.out.println("Payment of amount "+amount+" done using UPI.");
	}
}

public class InterfaceOneMoreExample {

	public static void main(String[] args) {
		
		Payment P1 = new CreditCardPayment();
		P1.makePayment(2000);
		
		Payment P2 = new UpiPayment();
		P2.makePayment(5245.87);
		
		Payment.staticMethod();
		

	}

}
