package sukkiriNyumon.chapter1_04;

public class Code12_Array_Random {
	public static void main(String[] args) {
		int[] seq = new int[10];
		char[] base = {'A', 'T', 'G', 'C'};
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
			// seqで割り振られたランダムな数字に対応するbase変数の値を出力
			System.out.print(base[seq[i]] + " ");
		}
		
		//変更前
//		for (int i = 0; i < seq.length; i++) {
//			switch (seq[i]) {
//			case 0:
//				System.out.print("A");
//				System.out.print(" ");
//				break;
//			case 1:
//				System.out.print("T");
//				System.out.print(" ");
//				break;
//			case 2:
//				System.out.print("G");
//				System.out.print(" ");
//				break;
//			case 3:
//				System.out.print("C");
//				System.out.print(" ");
//				break;
//			}
//		}
		
		//変更後　switchより簡潔な書き方
		//ランダムな数字に応じて、何を表示させるかを最初に定義
//		char[] base = {'A', 'T', 'G', 'C'};
		//for文の中に記入
//		System.out.print(base[seq[i]] + " ");
		
	}
}
