package sukkiriNyumon.chapter1_11;

//使わないです

public class Character0 {
	String name;
	int hp;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	//戦う
	/*これを継承するにあたり、メソッドの中身を確定してしまうと、不都合が起こる。
	 * （あとでダメージ数値を変えたい、など）
	 * 対策１、そのため、メソッドの中身をからにして、継承先でオーバーライドしてもらう。*/
	public void attack(Matango m) {
	
	}
	/*空メソッド心配事３つ
	 * １、オーバーライドし忘れ
	 * ２、なにもしないメソッドか区別がつかない
	 * ３、継承前提のクラスを[new]で利用されてしまう（未完成なクラスは[new]でインスタンス化されてはならない） */

}
