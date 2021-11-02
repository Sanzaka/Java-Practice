package sukkiriNyumon.chapter1_04;

public class Code14_For_Expansion {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		
		//拡張For文　=　配列の全ての値を取り出す
		//forで定義する変数に、配列変数の値が順に代入されている
		
//		for (要素の型 任意の変数名 : 配列変数名) {}
		for (int value : scores) {
			System.out.println(value);
		}
	}
}
