import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// Auto-generated try catch block
		try {
			FileWriter writer = new FileWriter("poem.txt");
			// auto create new file if not yet exist
			writer.write("Roses are red \nViolets are blue \nRockin' everywhere!"); // overwrite
			writer.append("\n(A poem by Bro)");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


