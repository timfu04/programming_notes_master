
public class Main {

	public static void main(String[] args) {
		
		// Encapsulation = attributes of a class will be hidden or private
		// 				   Can be accessed only through methods (getters & setters)
		// 				   You should make attributes private if you don't have a reason to make the public/ protected
		
		Car car = new Car("Chevrolet", "Camaro", 2021);
		
		// Calling getters
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		// Calling setter
		car.setYear(2022);
		
		System.out.println();
		
		// Calling getters
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}
}


