import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy01 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\matop\\Desktop\\sqledi2_Sample\\aa.txt");
		FileOutputStream fileOut = new  FileOutputStream("C:\\Users\\matop\\Desktop\\sqledi2_Sample\\aaout.txt");
		
		byte[] buf = new byte[256];
		int len;
		
		while((len = fileIn.read(buf)) != -1 ) {
			fileOut.write(buf);
		}
		
		fileOut.flush();
		
		fileOut.close();
		fileIn.close();
	}
}
