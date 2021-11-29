package sukkiriNyumon.chapter1_12;

public class Main06 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();

		//多態性と配列を利用しない一括処理
		h1.hp += 50;
		h2.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
	}
}
