package sukkiriNyumon.chapter1_09;
import sukkiriNyumon.chapter1_08.Hero;
import sukkiriNyumon.chapter1_08.Sword;

public class Code04_Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name + "です。");
		h.attack();
	}
}
