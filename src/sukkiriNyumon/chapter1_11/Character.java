package sukkiriNyumon.chapter1_11;

//abstract = 抽象
//クラス名にabstractを付与すると、そのクラスでインスタンス化ができなくなる。継承して用いる専用のクラスになる。
public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	//クラスにabstractを付与している場合のみ、
	//メソッドにabstractを付与してもよい。その場合、セミコロンで終えること。
	//これによって、オーバーライド前提のメソッドになる。
	public abstract void attack(Matango m);
}
