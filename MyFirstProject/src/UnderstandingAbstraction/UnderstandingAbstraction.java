package UnderstandingAbstraction;

abstract class Animal
{
	// Abstract method - It is a method which doesn't have any implementation/definition/body.
	
	abstract void Sound(); // It has no body, it is just an idea.
	
	void Sleep()
	{
		System.out.println("Animal is sleeping.");
	}
}

class Dog extends Animal
{

	@Override
	void Sound() 
	{
		System.out.println("Dog barks.");
	}
	
}


public class UnderstandingAbstraction {
	
	public static void main(String[] args) {

		Animal A1 = new Dog();
		A1.Sound();
		A1.Sleep();
		
		}
}



