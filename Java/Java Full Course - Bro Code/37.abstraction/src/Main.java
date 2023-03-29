
public class Main {

	public static void main(String[] args) {
		
		//	abstract = abstract class cannot be instantiated, but they can have a subclass
		//             abstract methods are declared without an implementation (abstract methods does not have a body, 
		//			   must be used in sub classes)
		// 			   add a layer of security
		
//		Vehicle vehicle = new Vehicle(); abstract class cannot be instantiated (this gives error)
		
		Car car = new Car();
		
		car.go();
	}
}


