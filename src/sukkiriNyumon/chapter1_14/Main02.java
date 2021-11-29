package sukkiriNyumon.chapter1_14;

import sukkiriNyumon.chapter1_13.Hero;

public class Main02 {
	public static void main(String[] args) {

		//全ての親クラスobjectには何でも入る
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		Object o4 = 0;
		Object o5 = 5.5;

		printAnything(o1);
		printAnything(o2);
		printAnything(o3);
		printAnything(o4);
		printAnything(o5);

	}

	//objectを引数にして、どのような値でも受け取ることができる。
	public static void printAnything(Object o) {
		System.out.println(o);
	}
}
