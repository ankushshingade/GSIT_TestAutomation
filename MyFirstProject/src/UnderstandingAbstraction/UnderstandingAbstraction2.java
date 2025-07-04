package UnderstandingAbstraction;

abstract class BankAccount{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void showBalance() {
		System.out.println(accountHolder+ " has " +balance+ " balance");
	}
	
	abstract void calculateInterest();
	
//	abstract static void staticMethod();	// Not possible.
//	
//	abstract protected void protectedMethod();	// Possible.
//	
//	abstract public void publicMethod();	// Possible.
//	
//	abstract final void finalMethod();	// Not possible. 
	
	
}

class savingAccount extends BankAccount{
	savingAccount(String accountHolder, double balance){
		super(accountHolder, balance);
	}

	@Override
	void calculateInterest() {
		double interest = balance*0.04;
		System.out.println("Saving account interest is: "+interest);		
	}
}

class currentAccount extends BankAccount{
	currentAccount(String accountHolder, double balance){
		super(accountHolder, balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No interest calculated for Current account.");		
	}
}
public class UnderstandingAbstraction2 {

	public static void main(String[] args) {
		savingAccount SV = new savingAccount("Shivam", 30000);
		SV.showBalance();
		SV.calculateInterest();
				
		currentAccount AS = new currentAccount("Ankush", 400000);
		AS.showBalance();
		AS.calculateInterest();
						
				
	}

}
