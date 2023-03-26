
public class Main {

	public static void main(String[] args) {
		
		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee, cup)
		
		// both myCar1 and myCar2 are Chevrolet Corvette because its defined in the Car class
		// use constructors to instantiate different types of car
		Car myCar1 = new Car();
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		myCar1.drive();
		myCar1.brake();
		
		System.out.println("\n");
		
		Car myCar2 = new Car();
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
	}
}


