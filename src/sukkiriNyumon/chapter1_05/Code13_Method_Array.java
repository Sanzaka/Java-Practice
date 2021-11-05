package sukkiriNyumon.chapter1_05;

public class Code13_Method_Array {
	
	//引数となった配列のそれぞれの値に、インクリメントを行う
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3};
		
		incArray(array);
		for (int i : array) {
			//値渡しが反映されているか確認
			System.out.println(i);
		}
	}
}
