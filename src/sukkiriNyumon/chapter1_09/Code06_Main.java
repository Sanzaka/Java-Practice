package sukkiriNyumon.chapter1_09;

import sukkiriNyumon.chapter1_08.Hero;
import sukkiriNyumon.chapter1_08.Wizard;

public class Code06_Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		Wizard w1 = new Wizard();
		w1.name = "スガワラ";
		w1.hp = 100;
		w1.heal(h1);
		w1.heal(h2);
		w1.heal(h2);

	}
}
