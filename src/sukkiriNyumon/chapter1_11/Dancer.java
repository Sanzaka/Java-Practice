package sukkiriNyumon.chapter1_11;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った！");
	}
	
	//attackはcharacterの抽象クラスなので、実装しないとエラーとなる。
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
}
