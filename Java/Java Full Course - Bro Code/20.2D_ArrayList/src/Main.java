import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// 2D Array List = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("coffee");
		
		// 2D ArrayList
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0)); // first ArrayList
		System.out.println(groceryList.get(0).get(0)); // first element in first ArrayList
		System.out.println(groceryList.get(2).get(1)); // second element in third ArrayList
	}
}


