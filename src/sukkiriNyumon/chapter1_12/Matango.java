package sukkiriNyumon.chapter1_12;

public class Matango extends Monster{

	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("15のダメージ");
		h.hp -= 15;
	}
	
	public void run() {
		System.out.println("ゆっくり逃げた");
	}


}
