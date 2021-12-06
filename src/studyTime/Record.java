package studyTime;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Record {
	//日付情報
	Time time = new Time();
	String year = time.getYear();
	String month = time.getMonth();
	String date = time.getDate();
	//カレントパス情報
	Path p = Paths.get("studyTime");
	String currentFolder = p.toAbsolutePath().toString();
	String yearFolder = currentFolder + "\\" + year;
	String monthFile = currentFolder + "\\" + year + "\\" + month + ".txt";
	//ファイル確認情報

	public void setStart() {
		File writingFile = new File(monthFile);




		//try-with-resources文で、finallyを省略
//		try (FileReader fr = new FileReader(writingFile);){
//			//記述前に、前回実行したのがstartでないかを確認する
//			BufferedReader br = new BufferedReader(fr);
//			String text;
//			while ((text = br.readLine()) != null) {
//				System.out.println(text);
//			}
//		} catch (IOException e) {
//			System.out.println(e);
//		}

		//実際に記述する
		try(FileWriter fl = new FileWriter(writingFile, true);) {
			BufferedWriter bw = new BufferedWriter(fl);
			//ファイル記述部分
			bw.newLine();
			bw.write("start　　" + time.currentTime + "～");
			bw.newLine();
			bw.newLine();
			bw.newLine();
			bw.write("----------");
			bw.close();
			System.out.println("開始時間を記録しました！");
		} catch (IOException e) {
			System.out.println(e);
		}



	}

	public void setEnd() {
		try {
			File writingFile = new File(monthFile);
			FileWriter fl = new FileWriter(writingFile, true);
			BufferedWriter bw = new BufferedWriter(fl);
			//ファイル記述部分
			bw.newLine();
			bw.write("end　　　～" + time.currentTime);
			bw.newLine();
			bw.newLine();
			bw.newLine();
			bw.write("----------");
			bw.close();
			System.out.println("終了時間を記録しました！");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void revision() {

	}
	public void quit() {
		System.out.println("終了します。");
	}


	public void dataCreate() throws IOException {
		//各フォルダ、ファイルを収納するカレントフォルダの作成
		File folder1 = new File(currentFolder);
		if (folder1.mkdir()) {
			System.out.println("studyTimeフォルダを新たに作成しました");
		} else {
			System.out.println("studyTimeフォルダは存在します");
		}
		System.out.println("パス = " + currentFolder);

		//年単位にフォルダを分ける。今年のフォルダを作成
		File folder2 = new File(yearFolder);
		if (folder2.mkdir()) {
			System.out.println("今年のフォルダを新たに作成しました");
		} else {
			System.out.println("今年のフォルダは存在します");
		}

		//今年のフォルダに、今月のファイルを作成
		File file = new File(monthFile);
		if (file.createNewFile()) {
			System.out.println("今月のファイルを新たに作成しました");
		} else {
			System.out.println("今月のファイルは存在します");
		}
	}

}
