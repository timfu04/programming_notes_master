import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Serialization = The process of converting an object into a byte stream. 
		// 				   Persists (saves the state) the object after program exits
		// 				   This byte stream can be saved as a file or sent over a network
		// 				   Can be sent to a different machine
		// 				   Byte stream can be saved as a file (.ser) which is platform independent
		// 				   (Think of it as if you're saving a file with the object's information)	
		
		// Deserialization = The reverse process of converting a byte stream into an object.
		//				     (Think of this as if you're loading a saved file)
	
		// Steps to Serialize
		// ------------------------------------------------------------------
		// 1. Your object class should implement Serializable interface
		// 2. Add import java.io.Serializable
		// 3. FileOutputStream fileOut = new FileOutputStream(file path);
		// 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		// 5. out.writeObject(objectName)
		// 6. out.close(); fileOut.close()
		// ------------------------------------------------------------------
		
		User user = new User();
		
		user.name = "Bro Code";
		user.password = "password123";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser"); // saved as byte code
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close(); 
		fileOut.close();
		
		System.out.println("Object info saved !");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}
}


