package sukkiriNyumon.chapter1_12;

public class Main04 {
	public static void main(String[] args) {
		Wizard w = new Wizard();

		//多態性を利用し、親クラスのCharacterの変数型を利用し、インスタンス化されたWizardを代入
		Character c = w;
		Matango m = new Matango('A');

		c.name = "アサカ";
		c.attack(m);

		//fireballメソッドは、characterで定義されていないためエラーが生じる
//		c.fireball(m);

		//
	}
}
