
public class Main {

	public static void main(String[] args) {
		
		// toString() = special method that all object inherit,
		// 				that returns a string that "textually represents" an object
		// 				can be used both implicitly and explicitly	
		
		Car car = new Car();

		// Both statement below do the same thing (it returns memory address by default before override the "toString" method)
		System.out.println(car); // called implicitly
		
		System.out.println();		
		
		System.out.println(car.toString()); // called explicitly
	}
}


