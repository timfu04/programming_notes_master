import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Steps to Deserialize
		// --------------------------------------------------------------
		// 1. Declare your object (don't instantiate)
		// 2. Your class should implement Serializable interface
		// 3. Add import java.io.Serializable
		// 4. FileInputStream fileIn = new FileInputStream(file path);
		// 5. ObjectInputStream in = new ObjectInputStream(fileIn);
		// 6. objectName = (Class) in.readObject();
		// 7. in.close(); fileIn.close()
		
		// Extra notes
		// 1. children class of a parent class that implements Serializable will do so as well
		// 2. static field are not serialized (they belong to the class, not an individual object)
		// 3. the class's definition ("class file") itself is not recorded, cast it as the specified object type 
		// 4. Fields declared as "transient" aren't serialized, they're ignore
		// 5. serialVersionUID is a unique version ID
		
		// SerialVersionUID = serialVersionUID is a unique ID that functions like a version #
	    //					  verifies that the sender and receiver of a serialized object,
	    //					  have loaded classes for that object that are compatible
	    //				      Ensures object will be compatible between machines
	    //					  Number must match. otherwise this will cause a InvalidClassException
	    //					  A SerialVersionUID will be calculated based on class properties, members, etc.
	    //					  A serializable class can declare its own serialVersionUID explicitly (recommended)
	
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Clement\\Desktop\\programming_notes\\Java\\Java Full Course - Bro Code\\75.(p1)serialization(serializer)\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject(); // cast to "User"
		in.close(); 
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}
}


