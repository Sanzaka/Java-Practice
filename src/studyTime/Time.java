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

	//月、日、時間、分の順で格納された配列を、分数にして返す
	
	
	public int getTotalMinute(Integer[] array) {
		int totalMinute = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				//月を分数に
				totalMinute += (array[i] * 43200);
			} else if (i == 1) {
				//日を分数に
				totalMinute += (array[i] * 1440);
			} else if (i == 2) {
				//時間を分数に
				totalMinute += (array[i] * 60);
			} else if (i == 3) {
				//分をそのまま加算
				totalMinute += array[i];
			}
		}
		return totalMinute;
	}
	
	//分数を、MM/dd　HH:mmの形式にして返す
	public String getElapsedTime(int minute) {
		int elapsedTime = 0;

	}

}
