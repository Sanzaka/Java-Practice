package studyTime;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Check {
	Record record = new Record();
	Data data = new Data();
	File currentFolder = new File(record.currentFolder);
	File yearFolder = new File(record.yearFolder);
	File monthFile = new File(record.monthFile);

	//使用するファイルのうち、全ての存在確認
	public boolean existsAllItem() {
		if(!existsCurrentFolder()) {
			System.out.println("studyTimeフォルダが存在しません");
			System.exit(0);
			return false;
		} else if(!existsYearFolder()) {
			System.out.println("今年のフォルダが存在しません");
			System.exit(0);
			return false;
		} else if(!existsMonthFile()) {
			System.out.println("今月のファイルが存在しません");
			System.exit(0);
			return false;
		} else {
			return true;
		}
	}

	//studyTimeフォルダのみ、存在確認
	public boolean existsCurrentFolder() {

		if(currentFolder.exists()) {
			return true;
		} else {
			System.out.println("studyTimeフォルダが存在しません");
			System.exit(0);
			return false;
		}
	}

	//今年のフォルダのみ、存在確認
	public boolean existsYearFolder() {
		if(yearFolder.exists()) {
			return true;
		} else {
			System.out.println("今年のフォルダが存在しません");
			System.exit(0);
			return false;
		}
	}

	//今月のファイルのみ、存在確認
	public boolean existsMonthFile() {
		if(monthFile.exists()) {
			return true;
		} else {
			System.out.println("今月のファイルが存在しません");
			System.exit(0);
			return false;
		}
	}

	//前回実行した処理を確認
	public boolean isSameExecution(String inputChar) {

		try (Scanner sc = new Scanner(new File(record.monthFile));){
			//テキストファイル全文を取得
			ArrayList<String> array = data.textContents();
			//テキストファイルが空の状態ならtrue
			if (array.size() == 0) {
				return true;
			}
			System.out.println("--前回処理--");
			//各処理は4行で行われるため、最終行から4行前の位置を取得して、前回処理の確認
			for (int i = array.size() - 4; i < array.size(); i++) {
				System.out.println(array.get(i));
			}
			String setTitle = array.get(array.size() - 4);

			if (setTitle.contains(inputChar)) {
				System.out.println("前回と同一の処理が実行されました。\n前回処理がstartならe、前回処理がendならsを入力してください。");
				System.exit(0);
				return false;
			}

		} catch(IOException e) {
			System.out.println("エラー発生" + e);
		}
		return true;
	}

 }
