import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList = a resizable array.
		// 			   Elements can be added and removed after compilation phase
		//			   only store reference data types
		//   		   e.g. ArrayList<Integer> example = new ArrayList<Boolean>();
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi"); // replace element in index 0 (replace "pizza" with "sushi")
		food.remove(2); // remove element in index 2
		food.clear(); // remove everything in ArrayList
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}


