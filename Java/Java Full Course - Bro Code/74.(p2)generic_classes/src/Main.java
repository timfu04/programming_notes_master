import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// bounded types = you can create the objects of a generic class to have data of specific derived types ex.Number
		
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharacterClass myChar = new MyCharacterClass('@');
		MyStringClass myString = new MyStringClass("Hello");
		
		// Without generic classes
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		System.out.println();
		
		// Specify what reference type youre passing into the constructor in the angle bracket
		MyGenericClass <Integer, Integer> myInt2 = new MyGenericClass<>(1, 9);
		MyGenericClass <Double, Double> myDouble2 = new MyGenericClass<>(3.14, 1.01);
		
		// Error because not passing in sub class of Number class (e.g. Double, Integer, etc.)
//		MyGenericClass <Character, Character> myChar2 = new MyGenericClass<>('@', '$');
//		MyGenericClass <String, Character> myString2 = new MyGenericClass<>("Hello", '!');
		
		// With generic classes
		System.out.println(myInt2.getValue());
		System.out.println(myDouble2.getValue());
//		System.out.println(myChar2.getValue());
//		System.out.println(myString2.getValue());
		
		System.out.println(myInt2.getValue2());
		System.out.println(myDouble2.getValue2());
//		System.out.println(myChar2.getValue2());
//		System.out.println(myString2.getValue2());
		
		// Example
		// HashMap class uses generics too
		HashMap <Integer, String> users = new HashMap<>();
	}
}


