package studyTime;

import java.util.Calendar;

public class Time {
	Calendar cl = Calendar.getInstance();

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

}
