package sukkiriNyumon.chapter1_15;

import java.util.Calendar;
import java.util.Date;

public class Main12 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now);
		
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
