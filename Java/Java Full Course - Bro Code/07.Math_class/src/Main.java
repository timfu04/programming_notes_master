
public class Main {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		double z = 10;
		
		// compare and return the larger value (x is the larger value in this case)
		double a = Math.max(x, y);
		
		// compare and return the smaller value (y is the smaller value in this case)
		double b = Math.min(x, y);
		
		// find the absolute value
		double c = Math.abs(y);
		
		// find the square root value
		double d = Math.sqrt(z);
		
		// find the rounded value
		double e = Math.round(x);
		
		// always round up
		double f = Math.ceil(x);
		
		// always round down
		double g = Math.floor(x);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}


