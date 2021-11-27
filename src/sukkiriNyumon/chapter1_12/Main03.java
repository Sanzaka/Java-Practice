package sukkiriNyumon.chapter1_12;

//多態性を利用せずに、インスタンス生成
public class Main03 {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango('A');

		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
	}
}
