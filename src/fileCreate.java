import java.io.File;
import java.io.IOException;

public class fileCreate {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\matop\\Desktop\\sqledi2_Sample\\aa");
		
		if (file.createNewFile()) {
			System.out.println("ファイル作成成功");
		} else {
			System.out.println("ファイル作成失敗");
		}
	}
}
