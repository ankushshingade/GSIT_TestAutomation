package UnderstandingAbstraction;

interface vehical{
	void start();
}

class Car implements vehical{
	public void start() {
		System.out.println("Car started.");
	}
}
public class UnderstandingInterfaces {

	public static void main(String[] args) {
		Car C1 = new Car();
		C1.start();

	}

}
