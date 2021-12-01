package sukkiriNyumon.chapter1_15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main13 {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		//文字列からDateインスタンスを生成
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

		//Dateインスタンス化から文字列を生成
		Date now = new Date();
		String s = f.format(now);
		
		System.out.println("現在は" + s + "です");
	}
}
