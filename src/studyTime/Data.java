package studyTime;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Data {
	Record record = new Record();
	Time time = new Time();

	public ArrayList<String> textContents() {
		ArrayList<String> array = null;

		try (Scanner sc = new Scanner(new File(record.monthFile));){
			//ArrayListを用いて、テキストファイルの内容を配列に代入
			array = new ArrayList<String>();
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				array.add(data);
			}
		} catch(IOException e) {
			System.out.println("エラー発生" + e);
		}

		return array;
	}

	//start~endまでの経過時間を計算する
	public int getLastTime() {

		ArrayList<String> array = textContents();
		//テキストファイルが空ならなにもしない
		if (array.size() == 0) {
			return 0;
		}
		//前回実行、今回実行の時間を読み取る
		String startTimeLine = array.get(array.size() - 4);
		String startTimeStr = startTimeLine.substring(startTimeLine.length() - 11);
		//時間をそれぞれ配列に格納
		String[] startTimeStrArr = startTimeStr.split("[　/:]");
		String[] currentTimeStrArr = time.currentTime.split("[　/:]");
		//String[]をint[]に変換
		Integer[] startTime = Stream.of(startTimeStrArr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		Integer[] currentTime = Stream.of(currentTimeStrArr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		//MM/dd　HH:mmこの形式で保存されている
		//それぞれの値を分数に直して計算
		int startMinute = time.getTotalMinute(startTime);
		int currentMinute = time.getTotalMinute(currentTime);
		
		//分数の差分を計算
		int stydyTime = currentMinute - startMinute;
		
		
	}
}
