package sukkiriNyumon.chapter1_15;

public class Main04 {
	public static void main(String[] args) {

		String s1 = "　Javaプログラミング　入門　";

		//toLowerCase() = 大文字を小文字に変換する
		System.out.println("toLowerCase() :" + s1.toLowerCase());
		
		//toUpperCase() = 小文字を大文字に変換する
		System.out.println("toUpperCase() :" + s1.toUpperCase());
		
		//trim() = 前後の半角スペースを除去する（全角はreplaceAllを用いて除去すること）
		System.out.println("trim() :" + s1.trim());
		
		//replace(str1, str2) =str1の文字をstr2に入れ替える 
		System.out.println("replase() :" + s1.replace("　", "\\"));
	}
}
