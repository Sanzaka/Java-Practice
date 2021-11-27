package studyTime;

import java.io.File;
import java.io.IOException;

public class Create {
	String currentFolder = "C:\\Users\\matop\\Desktop\\studyTime";

	public void createFolder(String year) {
		File folder1 = new File(currentFolder);
		File folder2 = new File(currentFolder + "\\" + year);

		if (folder1.mkdir()) {
			System.out.println("studyTimeフォルダが見当たらなかったため、新たに作成しました");
		} else {
			System.out.println("studyTimeフォルダは存在します");
		}

		if (folder2.mkdir()) {
			System.out.println("対象の年フォルダが見当たらなかったため、新たに作成しました");
		} else {
			System.out.println("対象の年フォルダは存在します");
		}
	}

	public void createFile(String year, String month) throws IOException{
		File file = new File(currentFolder + "\\" + year + "\\" + month);

		if (file.createNewFile()) {
			System.out.println("今月のファイルがなかったため作成しました");
		} else {
			System.out.println("今月のファイルは存在します");
		}

	}

}
