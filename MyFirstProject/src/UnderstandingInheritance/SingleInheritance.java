package UnderstandingInheritance;

class Vehical
{
	
	void run() 
	{
		
		System.out.println("Vehical is running...");
	}
}

class Car extends Vehical
{
	
	void runCar() 
	{
		
		System.out.println("Car is running...");
	}
	
}

class Innova extends Car
{
	void runInnova()
	{
		System.out.println("Innova is running...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Car C1 = new Car();
		C1.run();
		C1.runCar();
		
		Innova IN1 = new Innova();
		IN1.run();
		IN1.runCar();
		IN1.runInnova();
		

	}

}
