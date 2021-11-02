package sukkiriNyumon.chapter1_04;

public class Code17_Array_Null {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		array = null;
		array[1] = 10;	//<=nullを代入したため（参照を切ったため）エラーになる
	}
}
