import java.io.Serializable;

public class User implements Serializable{ // implements Serializable
	
//	private static final long serialVersionUID = 1; // specify serialVersionUID to 1 (version control - e.g. 1 for version 1, will change to 2 for version2)
	
	String name;
	// both serializer and deserializer must be both transient if specified
	transient String password; // this variable is ignored when serialized
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
}


