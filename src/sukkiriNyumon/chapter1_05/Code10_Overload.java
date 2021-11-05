package sukkiriNyumon.chapter1_05;

public class Code10_Overload {
	
	//1つめのaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	
	//2つめのaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	
	//3つめのaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void main(String[] args) {
		
		//同一名のメソッド呼び出し
		System.out.println(add(10, 20));
		System.out.println(add(2.3, 4.5));
		System.out.println(add("あいう", "えお"));
		
		System.out.println(add(10, 20, 30));
		
	}
}
//仮引数（メソッド定義に記述される引数）が異なれば、同名のメソッドを複数定義することも許される。
//仮引数の型が違う場合、個数が違う場合に、同名メソッドの定義が可能ある。