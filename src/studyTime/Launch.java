package studyTime;

import java.util.Scanner;

public class Launch {

	public String check() {
		
		
		//文字入力を受け付ける
		Scanner scanner = new Scanner(System.in);
		System.out.println("studyTimeへようこそ。\ns, e, rのいずれかを入力してください。 \n"
				+ "s = start, e = end, r = revision, q = quit");
		
		String inputChar = scanner.nextLine();
		
		return inputText;
	}
}
