
public class Main {

	public static void main(String[] args) {
		
		// polymorphism = greek word for poly-"many", morph-"form"
		//				  The ability of an object to identify as more than one type (data type)

		// All these 3 objects(Car, Bicycle, Boat) can also be identify as Vehicle (in common)
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		// Store them in Vehicle array
		Vehicle[] racers = {car, bicycle, boat};
		
		
		// for-each loop/ enhanced for loop
		for(Vehicle x : racers) {
			x.go();
		}
	}
}


