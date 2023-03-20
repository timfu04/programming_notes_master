
public class Main {

	public static void main(String[] args) {
		
		// array - used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla"}; // only can store String data type elements
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]); // this will give error
		
		System.out.println("-----Second array----");
		
		String[] cars2 = new String[3]; // declaration by specifying the size
		
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
		for (int i=0; i<cars2.length; i++) {
			System.out.println(cars2[i]);
		}
	}

}


