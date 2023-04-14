import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// for-each (enhanced for-loop) - traversing technique to iterate through the elements in an array/ collection 
		// 			  less steps, more readable than standard for loop
		// 			  less flexible
		
		// array
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		// for-each loop
		for(String i : animals) {
			System.out.println(i);
		}
	
		System.out.println("\n");
		
		// ArrayList is a type of collection
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		// for-each loop
		for(String i : animals2) {
			System.out.println(i);
		}
	}
}


