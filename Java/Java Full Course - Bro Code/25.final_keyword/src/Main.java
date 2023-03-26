
public class Main {

	public static void main(String[] args) {
		
		// final - anything declared as final cannot be changed later in the program
		
		double pi = 3.14159;
		pi = 4;
		System.out.println(pi);
		
		// Common practice - name final variables with capitcal letters
		final double PI = 3.14159;
//		PI = 4; // cannot update final variable (get error)
		System.out.println(PI);
	}
}


