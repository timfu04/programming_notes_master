import java.io.Serializable;

public class User implements Serializable{ // implements Serializable

	String name;
	transient String password; // both serializer and deserializer must be both transient if specified
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
}


