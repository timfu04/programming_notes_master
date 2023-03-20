
public class Main {

	public static void main(String[] args) {
		
		// String - a reference data type that can store one or more characters 
		// reference data types have access to useful methods
		
		String name = " B r o ";
		
		boolean result = name.equals("Bro"); // case-sensitive
		boolean result2 = name.equalsIgnoreCase(" b r o "); // case-insensitive
		
		int result3 = name.length();
		
		char result4 = name.charAt(1);
		
		int result5 = name.indexOf("o");
		
		boolean result6 = name.isEmpty();
		
		String result7 = name.toUpperCase();
		String result8 = name.toLowerCase();
		
		String result9 = name.trim();
		
		String result10 = name.replace("o", "u");
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
	}

}


