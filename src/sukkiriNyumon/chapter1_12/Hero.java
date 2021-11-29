package sukkiriNyumon.chapter1_12;

public class Hero extends Character{
	String name = "みなと";

	//親クラスを指定すると、子クラスにも対応可能になる。（多態性）
	//つまり、Matango m を入れても、このメソッドは動作する。
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("10ダメージ");
		m.hp -= 10;
	}
}
