package sukkiriNyumon.chapter1_04;

public class Code09_Array_For {
	public static void main(String[] args ) {
		int[] scores = {20, 30, 40, 50, 60};
		
		//forで定義する変数を用いて、配列の全ての値を順に取り出す
		//配列の要素数が代わっても、値を全て取り出せる。
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
}
