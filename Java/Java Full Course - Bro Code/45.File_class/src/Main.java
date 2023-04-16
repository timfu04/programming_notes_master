import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		// file = An abstract representation of file and directory path names
		// Use file name if file is in project directory
		// Use file path if file is outside project directory
		
		// Initially look into project directory to find file
		File file = new File("secret_message.txt");
		
		if (file.exists()) {
			System.out.println("That file exist!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
//			file.delete(); // delete file
		}
		else {
			System.out.println("That doesn't file exist.");
		}
		
		
		// Other examples
		// Extra backslash to escape backslash
//		File file2 = new File("C:\\Users\\Clement\\Desktop\\secret_message.txt");
//		
//		if (file2.exists()) {
//			System.out.println("That file exist!");
//		}
//		else {
//			System.out.println("That doesn't file exist.");
//		}
		
		
		
//		File file3 = new File("C:/Users/Clement/Desktop/secret_message.txt");
//		
//		if (file3.exists()) {
//			System.out.println("That file exist!");
//		}
//		else {
//			System.out.println("That doesn't file exist.");
//		}
		
	}
}


