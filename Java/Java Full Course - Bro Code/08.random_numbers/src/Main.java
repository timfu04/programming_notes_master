import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Not true random numbers, but pseudo random numbers
		// Pseudo random numbers: artifically generated random numbers
		
		Random random = new Random();
		
		int x = random.nextInt(6) + 1; // starts with 0 by default, add 1 to make it between 1 and 6
		double y = random.nextDouble(); // by default, random value between 0 and 1
		boolean z = random.nextBoolean(); // true or false
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}


