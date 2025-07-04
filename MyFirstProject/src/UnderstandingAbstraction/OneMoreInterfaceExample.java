package UnderstandingAbstraction;

interface Engine{

	void start();	// Abstract method
	void stop(); 	// Abstract method
	
}

class PetrolEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Petrol Engine implementation for START feature.");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine implementation for STOP feature.");
		
	}
}

class DiselEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Disel Engine implementation for START feature.");
		
	}

	@Override
	public void stop() {
		System.out.println("Disel Engine implementation for STOP feature.");
		
	}
}

class Car2 {
	
	Engine engine;	// Instance variable / Reference variable
	
	Car2(Engine engine){
		
		this.engine = engine;
	}
	
	void drive() {
		System.out.println("Car is going to drive: ");
		engine.start();
	}
}

public class OneMoreInterfaceExample {

	public static void main(String[] args) {

		Engine E1 = new PetrolEngine();
		E1.start();
		E1.stop();
		
		Engine E2 = new DiselEngine();
		E2.start();
		E2.stop();
		
		Engine E3 = new PetrolEngine();
		Car2 C1 = new Car2(E3);
		C1.drive();
		
		Engine E4 = new DiselEngine();
		Car2 C2 = new Car2(E4);
		C2.drive();

	}

}
