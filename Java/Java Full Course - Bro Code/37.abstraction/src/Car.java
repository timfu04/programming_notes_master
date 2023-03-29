
public class Car extends Vehicle{

	// abstract "go" method must implemented here (sub class), else it gives error
	@Override
	void go() {
		System.out.println("The driver is driving the car");
	}
}


