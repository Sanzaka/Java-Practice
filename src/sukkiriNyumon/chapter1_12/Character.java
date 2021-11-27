package sukkiriNyumon.chapter1_12;

public abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println("逃げ出した！");
	}

	public void attack(Matango m) {
		System.out.println("敵に５のダメージを与えた！");
		m.hp -= 5;
	}
}
