package UnderstandingInheritance;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal is making sound.");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog is making sound.");
	}
	
	void eat()
	{
		System.out.println("Dog is eating.");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat is making sound.");
	}
}

class NewDog extends Dog
{
	void makeSound()
	{
		System.out.println("NewDog is making sound.");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {

		// Method overriding is Run Time Polymorphism.
		
		Dog D1 = new Dog();
		D1.makeSound();
		
		Animal A1 = new Dog(); 	// This is referred as Loose coupling.
		A1.makeSound();
		
		Animal A2 = new Cat(); 	// This is referred as Loose coupling.
		A2.makeSound();
		
		Animal A3 = new NewDog();
		A3.makeSound();

	}

}
