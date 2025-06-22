package ObjectOrientedProgramming;

class Car {
	
	String brand;
	int speed;
	int numberOfSeats;
	
	void drive()
	{
		System.out.println("Car of "+brand+" is running with the "+speed+" and has "+numberOfSeats+" number of seats");
	}
	
	void applyBreaks()
	{
		System.out.println("Car stopped.");
	}
}

public class UnderstandingOOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car C1 = new Car();
		C1.brand = "Maruti";
		C1.speed = 60;
		C1.numberOfSeats = 5;
		C1.drive();
		C1.applyBreaks();
		

		Car C2 = new Car();
		C2.brand = "TATA";
		C2.speed = 80;
		C2.numberOfSeats = 7;
		C2.drive();
		C2.applyBreaks();
		
		Car C3 = new Car();
		C3.drive();
		C3.applyBreaks();

	}

}
