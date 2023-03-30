package package1;
import package2.*; // import everything from package2

public class A {
	
	protected String protectedMessage = "This is protected";

	public static void main(String[] args) {
		
		C c = new C();
		// "defaultMessage" variable from C not visible to class A because different package
//		System.out.println(c.defaultMessage); // gives error
		
		// Able to access "publicMessage" variable from class C because it is public
		System.out.println(c.publicMessage + " in A");
		
		
		
		B b = new B();
		// "privateMessage" variable from B not visible to class A because not same class
//		System.out.println(b.privateMessage); // gives error
	}
}


