package sukkiriNyumon.chapter1_11;

public class Hero {
	String name = "みなと";
	int hp = 100;

	public void attack() {
		System.out.println(this.name + "の攻撃");
//		enemy.hp -=5
		System.out.println("５のダメージを与えた！");
	}
}
