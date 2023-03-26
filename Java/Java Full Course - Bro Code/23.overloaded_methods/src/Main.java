
public class Main {

	public static void main(String[] args) {
		
		// overloaded methods - methods that share the same name but have different parameters
		//					    method name + parameters (number of parameters, orders, data types) = method signature
		
		int d = add(1, 2);
		int e = add(1, 2, 3);
		int f = add(1, 2, 3, 4);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		double x = add(1.0, 2.0);
		double y = add(1.0, 2.0, 3.0);
		double z = add(1.0, 2.0, 3.0, 4.0);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	// accept integer values
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	
	
	
	// accept double values
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}
}


