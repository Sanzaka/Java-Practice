package sukkiriNyumon.chapter1_04;

public class Code10_Array_For {
	public static void main(String[] args) {
		//　合計、平均の集計でよく用いられる方法
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		
		//応用　50点以上の科目の数を調べる
		int count = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目数は" + count + "です");
	}
}
