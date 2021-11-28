package studyTime;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

public class Record {
	Time time = new Time();
	Create create = new Create();

	public void start() throws IOException {
		//年、月が記載されたフォルダが存在しなければ作成
		String year = time.getYear();
		String month = time.getMonth();

		create.createFolder(year);
		create.createFile(year, month);



	}

	public void end() {

	}

	public void revision() {

	}
	public void quit() {

	}


	public static void time() throws IOException {
		Calendar cl = Calendar.getInstance();
		String year = Integer.toString(cl.get(Calendar.YEAR));
		String month = Integer.toString(cl.get(Calendar.YEAR));
		String folder = "C:\\Users\\matop\\Desktop\\studyTime";

		File searchFolder1 = new File(folder);
		File searchFolder2 = new File(folder + "\\" + year + "/" + month);

		//ディレクトリがなければ新たに作成

		if (!(searchFolder2.exists())) {
			Path path1 = Paths.get(folder + "\\" + year + "/" + month);
			Files.createDirectoies(path1);
			try {

			}catch(IOException e){
				System.out.println(e);
			}
		}
	}

}
