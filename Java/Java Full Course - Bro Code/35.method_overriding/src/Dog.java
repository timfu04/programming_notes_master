
public class Dog extends Animal{
	
	// This is overriding method
	// Add "@Override" annotation for good practice, does not add any functionality
	@Override
	void speak() {
		System.out.println("The dog does *bark*");
	}
}


