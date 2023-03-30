import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Dynamic Polymorphism
		// Polymorphism = many shapes/ forms
		// Dynamic = after compilation (during runtime)
		// e.g. A corvette is a: corvette, and a car, and a vehicle, and a object
		
		Scanner scanner = new Scanner(System.in);
		
		// This Animal object could be Dog or Cat 
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
	}
}


