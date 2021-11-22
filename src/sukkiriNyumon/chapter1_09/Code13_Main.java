package sukkiriNyumon.chapter1_09;

import sukkiriNyumon.chapter1_08.Hero;

public class Code13_Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);
	}
}
