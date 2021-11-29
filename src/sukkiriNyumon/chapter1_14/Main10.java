package sukkiriNyumon.chapter1_14;

public class Main10 {
	public static void main(String[] args) {
		//インスタンスを作成していなくても、静的フィールドならアクセス可能
		System.out.println(Hero.money);

		Hero h1 = new Hero();
		Hero h2 = new Hero();
		//静的フィールドの場合、クラスで値を共有される（アドレスが共有される）。
		//そのため、2人作っても値が増減することはない。
		System.out.println(Hero.money);

		//静的フィールドの場合、誰か一人を対象に値を操作しても、それは全体で共有される。
		h2.money += 1000;
		System.out.println(Hero.money);
		h1.money += 1000;
		System.out.println(h1.money);

		//定数と一緒に定義されることが多い。
		//「変化しない定数を、各インスタンスで共有するために」用いられる。

		Hero.setRandomMoney();
		System.out.println(Hero.money);
	}
}
