package sukkiriNyumon.chapter1_14;

public class Hero {
	String name;
	int hp;

	//静的メンバ化(static)することで、クラスで共有される値を作れる。
	static int money = 1000;

	//Objectクラスのequals()をオーバーライドして、正しく比較できるように設定する。
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

	//静的メソッド(static)では、静的メンバ(static)しか使えないため注意
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
}
