package sukkiriNyumon.chapter1_02;

public class Practice2_1 {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		//下の例では、文字列連結になってしまうため、510と表示されてしまう。
		String ans = "x+yは" + x + y;
		System.out.println(ans);
		
		//次のように、優先度を操作すれば、int同士の計算が先に行われて、15と表示される。
		ans = "x + y は" + (x + y);
		System.out.println(ans);
	}
}
