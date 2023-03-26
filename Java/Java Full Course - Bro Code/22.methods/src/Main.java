
public class Main {
	
	// main method
	public static void main(String[] args) {
		
		// method - a block of code that is executed whenever it is called upon
		String name = "Bro";
		int age = 21;
		hello(name, age);
		
		int x = 3;
		int y = 4;
		int z = add(x, y);
		System.out.println(z);
	}
	
	// need to be a static method to be accessed from another static method (main method)
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
	}
	
	// add two numbers
	// method that return integer
	static int add(int x, int y) {
		return x + y;
	}
}


