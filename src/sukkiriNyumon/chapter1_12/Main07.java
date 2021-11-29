package sukkiriNyumon.chapter1_12;

public class Main07 {
	public static void main(String[] args) {
		Character[] c = new Character[5];

		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Wizard();
		c[3] = new Wizard();
		c[4] = new Wizard();

		//多態性と配列を利用して一括処理
		for (Character ch : c) {
			ch.hp += 50;
		}

	}
}
