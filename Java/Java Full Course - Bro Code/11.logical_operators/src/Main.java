import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// logical operators - used to connect two or more expressions
		// && - (AND) both conditions must be true
		// || - (OR) either condition must be true
		// ! - (NOT) reverses boolean value of condition
		
		// && (AND)
		int temp = 25;
		
		if (temp > 30) {
			System.out.println("It is hot outside");
		}
		else if (temp >=20 && temp <=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
	
		
			
		// || (OR)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next(); // return individual text string one at a time
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game * pew pew *");
		}
		
		
		
		// ! (NOT)
		System.out.println("You are playing a game! Press q or Q to quit 2");
		String response2 = scanner.next(); // return individual text string one at a time
		
		if (!response2.equals("q") && !response2.equals("Q")) {
			System.out.println("You are still playing the game * pew pew 2*");
		}
		else {
			System.out.println("You quit the game");
		}
	
		scanner.close();
	}

}
