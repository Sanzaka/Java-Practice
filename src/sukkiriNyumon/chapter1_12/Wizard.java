package sukkiriNyumon.chapter1_12;

public class Wizard extends Character{
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

	public void fireball(Matango m) {
		System.out.println();
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}