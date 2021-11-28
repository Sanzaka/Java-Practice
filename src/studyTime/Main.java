package studyTime;


public class Main {
	public static void main(String[] args) {
		Launch launch = new Launch();
		Record record = new Record();

		String inputChar = launch.check();

		//有効な文字であるか確認する
		if (inputChar.equals("s")) {
			record.start();
		} else if(inputChar.equals("e")) {
			record.end();
		} else if(inputChar.equals("r")) {
			record.revision();
		} else if(inputChar.equals("q")) {
			record.quit();
		} else {
			System.out.println("その文字は受け付けられません。s, e, rのいずれかを入力してください。");
		}
		
		
		

	}
}
