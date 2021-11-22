package sukkiriNyumon.chapter1_09;

public class Practice02_Main {
	public static void heal(int hp) {
		hp += 10;
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アカサ", 25);
		System.out.println(baseHp + "　：　" + t.hp);

		// int型なので、baseHp変数には変化なし
		heal(baseHp);
		// クラス変数のため、参照渡しが行われる。そのため、メソッド内での変更が外でも反映されている。
		heal(t);

		System.out.println(baseHp + "　：　" + t.hp);
	}
}
