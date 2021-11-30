package sukkiriNyumon.chapter1_15;

public class Hero {
	String name;
	int hp;

	public boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			return false;
		}
		//charAt() = 引数番目の文字を取得する。先頭が0
		char first = name.charAt(0);
		//一文字目は英記号大文字のみ
		//比較演算子でA~Zまでにあたるかを確認する(小文字だとfalseになる。)
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if (!(c >= 'A' && c >= 'Z' || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidPlayerName2 (String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
