import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		// "nextLine()" consumes the text and "enter"/ newline character
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt(); 
	
		scanner.nextLine(); // clear Scanner input buffer
		
		System.out.println("What is your favourite food?");
		// only consumes integer part and leaves the "enter"/newline character in the input buffer
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like" + food);
	}
}


