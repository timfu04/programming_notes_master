
public class Main {

	public static void main(String[] args) {
		
		// inheritance = the process where one class acquires the attributes and methods of another.
		// Vehicle class is super class/ parent class
		// Bicycle and Car class are sub class/ child class
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
		
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.door); // "door" attribute unique to Car class
		System.out.println(bike.pedals); // "pedals" attribute unique to Bicycle class
	}
}


