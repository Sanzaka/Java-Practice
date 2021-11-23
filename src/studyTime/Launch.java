package studyTime;

import java.util.Scanner;

public class Launch {

	public static void check() {
		//文字入力を受け付ける
		Scanner scanner = new Scanner(System.in);
		System.out.println("studyTimeへようこそ。\ns, e, rのいずれかを入力してください。 \ns = start, e = end, r = revision, q = quit");
		String inputText = scanner.nextLine();

		//有効な文字であるか確認する
		if (inputText.equals("s")) {
			Record.start();
		} else if(inputText.equals("e")) {
			Record.end();
		} else if(inputText.equals("r")) {
			Record.revision();
		} else if(inputText.equals("q")) {
			Record.quit();
		} else {
			System.out.println("その文字は受け付けられません。s, e, rのいずれかを入力してください。");
		}
	}
}
