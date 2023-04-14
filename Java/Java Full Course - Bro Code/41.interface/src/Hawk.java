
public class Hawk implements Predator{ // implements Predator interface
	
	@Override
	public void hunt() {
		System.out.println("*The hawk is hunting*");
	}
	
	public void testPrint() {
		System.out.println("this is to prove variables can be inherit from interface class: " + test_string);
	}
}


