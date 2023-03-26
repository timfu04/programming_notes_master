import java.util.Random;

public class DiceRoller {
	
	// Declare these two variables as global scope, so all methods in the class can access 
	Random random;
	int number;
	
	// constructor is a method too
	DiceRoller(){
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}	
}


