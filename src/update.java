import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class update {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\matop\\Desktop\\sqledi2_Sample\\aa.txt");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Long update = file.lastModified();
		
		String updateStr = sdf.format(update);
		
		System.out.println("更新日：" + updateStr);
	}
}
