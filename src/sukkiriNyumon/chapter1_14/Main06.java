package sukkiriNyumon.chapter1_14;

public class Main06 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		h1.name = "ミナト";
		h2.name = "ミナト";
		h2.hp = 100;
		h2.hp = 100;

		//==によるインスタンス比較
		if (h1.equals(h2) == true ) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		//結果は「違う内容です」と表示される。


	}
}
