package sukkiriNyumon.chapter1_12;

public class Main10 {
	public static void main(String[] args) {
		Monster[] m = new Monster[3];

		m[0] = new Matango('A');
		m[1] = new Goblin();
		m[2] = new DeathBat();

		for (Monster mo : m) {
			//親クラスでのrunメソッド定義が必須
			mo.run();
		}
		
	}
}
