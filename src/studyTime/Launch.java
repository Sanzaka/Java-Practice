package studyTime;

import java.util.Scanner;

public class Launch {

	public void check() {
		Record record = new Record();
		
		//文字入力を受け付ける
		Scanner scanner = new Scanner(System.in);
		System.out.println("studyTimeへようこそ。\ns, e, rのいずれかを入力してください。 \ns = start, e = end, r = revision, q = quit");
		String inputText = scanner.nextLine();

		//有効な文字であるか確認する
		if (inputText.equals("s")) {
			record.start();
		} else if(inputText.equals("e")) {
			record.end();
		} else if(inputText.equals("r")) {
			record.revision();
		} else if(inputText.equals("q")) {
			record.quit();
		} else {
			System.out.println("その文字は受け付けられません。s, e, rのいずれかを入力してください。");
		}
	}
}
