package studyTime;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Launch launch = new Launch();
		Record record = new Record();
		Check check = new Check();

		// 1　studyTimeフォルダ、今年のフォルダ、今月のファイルの作成
		try {
			record.dataCreate();
		} catch (IOException e){
			System.out.println("ファイル(フォルダ)作成で不具合が発生しました");
			System.exit(0);
		}

		//文字入力を受け取り、inputCharに代入
		String inputChar = launch.check();

		//有効な文字であるか確認し、有効であれば各処理実行
		//最初に利用される全てのファイルが存在するか確認
		if(check.existsAllItem()) {
			if(inputChar.equals("s")) {
				check.isSameExecution(inputChar);
				record.setStart();
			} else if(inputChar.equals("e")) {
				check.isSameExecution(inputChar);
				record.setEnd();
			} else if(inputChar.equals("r")) {
				record.revision();
			} else if(inputChar.equals("q")) {
				record.quit();
			} else {
				System.out.println("その文字は受け付けられません。s, e, rのいずれかを入力してください。");
			}
		}

	}
}
