
public class Main {

	public static void main(String[] args) {
		
		// Expression = operands & operators
		// Operands = values, variables, numbers, quantity
		// Operators = + - * / % (% modules gives you the remainder of division)
		
		int friends = 10;
		int friends2 = 10;
		int friends3 = 10;
		int friends4 = 10;
		int friends5 = 10;
		int friends6 = 10;
		int friends7 = 10;
		
		friends  = friends + 1;
		friends2 = friends2 - 1;
		friends3 = friends3 * 2;
		friends4 = friends4 / 2;
		friends5 = friends5 % 3;
		
		// shorthand
		friends6 ++; // increment
		friends7 --; // decrement
		
		System.out.println(friends);
		System.out.println(friends2);
		System.out.println(friends3);
		System.out.println(friends4);
		System.out.println(friends5);
		System.out.println(friends6);
		System.out.println(friends7);
		
		// Integer division
		int friends8 = 10;
		// this will result in 3, instead of 3.33333...(truncate the decimal portion because integer cannot store it)
		friends8 = friends8 / 3; 
		System.out.println(friends8);
		
		// Solution
		double friends9 = 10;
		friends9 = (double) friends9 / 3; // cast division result into double
		System.out.println(friends9);
	}
}


