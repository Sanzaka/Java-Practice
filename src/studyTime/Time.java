package studyTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	//今日の日付の取得
	Calendar cl = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd　HH:mm");
	String currentTime = sdf.format(cl.getTime());
	//前回の日付の取得


	public String getYear() {
		String year = Integer.toString(cl.get(Calendar.YEAR));
		return year;
	}

	public String getMonth() {
		String month = Integer.toString(cl.get(Calendar.MONTH));

		//ファイル順をそろえるため、ファイル名が一桁なら文字列先頭に0を追加
		if (month.length() == 1) {
			month = "0" + month;
		}
		return month;
	}

	public String getDate() {
		String date = Integer.toString(cl.get(Calendar.DATE));

		//ファイル順をそろえるため、ファイル名が一桁なら文字列先頭に0を追加
		if (date.length() == 1) {
			date = "0" + date;
		}
		return date;
	}

	public String getHour() {
		String hour = Integer.toString(cl.get(Calendar.HOUR));
		return hour;
	}

	public String getMinute() {
		String minute = Integer.toString(cl.get(Calendar.MINUTE));
		return minute;
	}

	public String getSecond() {
		String second = Integer.toString(cl.get(Calendar.SECOND));
		return second;
	}

	//以下、前回日付の参照。
//	public int getLastTime() {
//		ArrayList<String> array = data.textContents();
//		if (array.size() == 0) {
//			return 0;
//		}
//		String lastTime = array.get(array.size() - 4);
//
//	}

}
