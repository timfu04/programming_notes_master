package package1;
import package2.*; // import everything from package2

public class B {
	
	// "privateMessage" variable is only visible to the class contain itself
	// Only class B has access to "privateMessage" variable
	private String privateMessage = "This is the private";
}


