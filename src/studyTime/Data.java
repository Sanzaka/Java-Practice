package studyTime;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	Record record = new Record();

	public ArrayList<String> textContents() {
		ArrayList<String> array = null;

		try (Scanner sc = new Scanner(new File(record.monthFile));){
			//ArrayListを用いて、テキストファイルの内容を配列に代入
			array = new ArrayList<String>();
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				array.add(data);
			}
		} catch(IOException e) {
			System.out.println("エラー発生" + e);
		}

		return array;
	}

	public int getLastTime() {

		ArrayList<String> array = textContents();
		if (array.size() == 0) {
			return 0;
		}
		String lastTimeLine = array.get(array.size() - 4);
		String lastTime = lastTimeLine.substring(lastTimeLine.length() - 11);

	}
}
