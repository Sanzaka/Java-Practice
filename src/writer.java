import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writer {
	public static void main(String[] args ) throws IOException{
		
		FileWriter file = new FileWriter("C:\\Users\\matop\\Desktop\\sqledi2_Sample\\aa.txt");
		PrintWriter pw = new PrintWriter(new BufferedWriter(file));
		
		pw.println("apple");
		pw.println("orange");
		pw.println("melon");
		
		pw.close();
		
	}
}
