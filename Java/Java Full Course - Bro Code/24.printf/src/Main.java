
public class Main {

	public static void main(String[] args) {
		
		// printf - an optional method to control, format, and display text to the console window 
		//          two arguments = format string + (object/variable/value)
		// 	        % [flags] [width] [precision] [conversion-character]
		// % - format specifier
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		//[conversion-character]
		// "b" for boolean values
		System.out.printf("%b\n", myBoolean);
		// "c" for characters
		System.out.printf("%c\n", myChar);
		// "s" for string
		System.out.printf("%s\n", myString);
		// "d" for decimal numbers
		System.out.printf("%d\n", myInt);
		// "f" for float-point numbers & double
		System.out.printf("%f\n", myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s\n", myString); // minimum 10 characters
		
		//[precision]
		// sets numbers of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f\n", myDouble);
		
		//[flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("I have this much money %20f\n", myDouble); // default
		System.out.printf("I have this much money %-20f\n", myDouble); // left-justify
		System.out.printf("I have this much money %+f\n", myDouble);
		System.out.printf("I have this much money %020f\n", myDouble); // add zero padding
		System.out.printf("I have this much money %,f\n", myDouble);
		
		
		// comma grouping separator (,)
		// 2 decimal places (.2)
		// width of 20 characters (20)
		System.out.printf("I have this much money %,20.2f\n", myDouble); 
	}
}


