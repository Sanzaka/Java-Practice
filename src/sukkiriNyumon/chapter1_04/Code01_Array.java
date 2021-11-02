package sukkiriNyumon.chapter1_04;

public class Code01_Array {
	public static void main(String[] args) {
		
		//配列を使わない例
//		int sansu = 20;
//		int kokugo = 30;
//		int rika = 40;
//		int eigo = 50;
//		int syakai = 80;
//		
//		int sum = sansu + kokugo + rika + syakai + eigo;
//		
//		int avg = sum / 5;
//		System.out.println("合計点:" + sum);
//		System.out.println("平均点:" + avg);
//		１、テスト科目が増えるたびに、コードに追加しなければならない
//		２、まとめて処理できない
		
		
		//配列を利用
		int[] scores = new int[5];
		
		//配列の個数を確認
//		int num = scores.length;
//		System.out.println(num);
//		System.out.println(scores.length);
		
		//配列に値を代入
		scores[1] = 30;
		System.out.println(scores[1]);
		
		//省略記法
		int[] scores1 = new int[] {10, 20, 30, 40, 50};
		int[] scores2 = {100, 200, 300, 400, 500};
		
		//Code1 ~ 7
	}
}
