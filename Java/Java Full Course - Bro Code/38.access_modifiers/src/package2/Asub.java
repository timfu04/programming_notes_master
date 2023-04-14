package package2;
import package1.*; // import everything from package1

public class Asub extends A{

	public static void main(String[] args) {
		
		C c = new C();
		// Able to access "defaultMessage" variable from class C because within same package
		System.out.println(c.defaultMessage + " in Asub");
		
		Asub asub = new Asub();
		// Able to access "protectedMessage" variable from different class and different package 
		// as long as it is the sub class of the class that contain the protected variable
		// "Asub" is subclass of "A"
		System.out.println(asub.protectedMessage);
	}
}


