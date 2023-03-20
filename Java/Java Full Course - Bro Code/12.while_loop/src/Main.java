import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// while loop - execute a block of code as long as it's condition remain true

		// while loop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while (name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		
		// do while loop
		// run the code at least once, then check the condition
		String name2 = "";
		
		do{
			System.out.print("Enter your name: ");
			name2 = scanner.nextLine();
		}while (name2.isBlank());
		
		System.out.println("Hello " + name2);	
		
		scanner.close();
	}
}


