package UnderstandingAbstraction;

interface Payment{
	
	void makePayment(double amount);
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
		

	}

}
