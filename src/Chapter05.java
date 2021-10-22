
public class Chapter05 {
	public static void main(String[] args) {
		
//		プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		int int1 = 5;
		double double1 = 0.5d;
		boolean boolean1 = false;
		
		System.out.println(int1);
		System.out.println(double1);
		System.out.println(boolean1);
		
//		ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float float2 = 1f;
		Integer int2 = 5;
		Character cha2 = 'あ';
		
		System.out.println(float2);
		System.out.println(int2);
		System.out.println(cha2);
		
//		要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array1 = new int[] {10, 20, 30, 40, 50};
		System.out.println(array1[3]);
	}
}
