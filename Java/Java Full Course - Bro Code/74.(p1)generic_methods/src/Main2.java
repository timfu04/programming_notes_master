
public class Main2 {

	public static void main(String[] args) {
		
		// Just an example, classes are not declared (get error)
		Player player = new Player();
		Enemy enemy = new Enemy();
		Item item = new Item();
		Tree tree = new Tree();
		
		draw(player);
		draw(enemy);
		draw(item);
		draw(tree);
	}
	
	// One method that accepts different reference types as arguments
	public static <T> void draw(T x) {
		x.draw();
	}
}


