
public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
		Car car2 = new Car("Ford", "Mustang", 2022);
		
		// copy all the values from car 1 (separated object, different memory address)
		car2.copy(car1);
		
		System.out.println(car1); // print memory address
		System.out.println(car2); // print memory address
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
		// Make a copy while instantiating Car object by creating another overloaded constructor
		Car car3 = new Car(car1);
		
		System.out.println(car3);
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
	}
}


