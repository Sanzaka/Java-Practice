package sukkiriNyumon.chapter1_08;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		if (this.mp >= 5) {
			this.mp -= 5;
			this.hp = this.MAX_HP;
			System.out.println(this.name + "はHPが" + this.MAX_HP + "まで回復した！");
		} else {
			System.out.println("MPが足りない！");
		}
	}

	public void pray(int sec) {
		int r = new java.util.Random().nextInt(3);
		this.mp += (r + sec);
		if (this.mp + r + sec > 10) {
			this.mp = 10;
		}
		System.out.println(this.name + "は、MPが"+ (r + sec) + "ポイント回復した！(現在" + this.mp + ")");
	}
}
