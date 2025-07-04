package UnderstandingAbstraction;

abstract class Animal
{
	// Abstract method - It is a method which doesn't have any implementation/definition/body.
	
	abstract void Sound(); // It has no body, it is just an idea.
	
	abstract void Walk();
	
	void Sleep()
	{
		System.out.println("Animal is sleeping.");
	}
}

abstract class Dog extends Animal
{

	@Override
	void Sound() 
	{
		System.out.println("Dog barks.");
	}
	
}

class petDog extends Dog
{

	@Override
	void Walk() {

		System.out.println("Walk pet dogs. Walk method inside petDog.");
		
	}
	
	@Override
	void Sound() {
		System.out.println("PetDog barking");
	}
	
}


public class UnderstandingAbstraction {
	
	public static void main(String[] args) {

		Animal A1 = new petDog();
		A1.Sound();
		A1.Sleep();
		A1.Walk();
		
		}
}



