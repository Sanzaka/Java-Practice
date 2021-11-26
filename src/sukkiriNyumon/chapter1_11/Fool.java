package sukkiriNyumon.chapter1_11;

public class Fool extends Character implements Human{

	String name = "あ";
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

//	これを書くと、Humanで定義したdafaultのtalkメソッドが初期化される
//	public void talk() {}

	public void watch() {}
	public void hear() {}
	public void run() {}
}
