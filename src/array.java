
public class array {
	public static void main(String[] args) {
//		配列の宣言と、生成。０番目から順に値を代入していく
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[1] = 20;
		array1[2] = 20;
		
//		インデックス番号２を指定して、３番目の要素のみを取得
		int int2 = array1[2];
		int array2[] = null;
		
//		変数と同様に、宣言と同時に初期化することができる。
		int[] array3 = new int[] {10, 20, 50};
		int[] array4 = {10, 20, 50};
	}
}
