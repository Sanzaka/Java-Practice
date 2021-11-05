package sukkiriNyumon.chapter1_05;

public class Code08_Return {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		//二重にaddメソッドを利用している。
		//メソッドを変数に代入しなくても、このように直接出力を行うことができる。
		System.out.println(add(add(10, 20), add(30, 40)));
	}
}
