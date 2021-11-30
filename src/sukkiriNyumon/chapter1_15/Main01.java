package sukkiriNyumon.chapter1_15;

public class Main01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		//equals() = 等しいかを調べる
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		// equalsIgunoreCase() = 大文字小文字を区別せず、等しいか調べる
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		//length() = 文字数を調べる
		System.out.println("s1の長さは" + s1.length() + "です。");

		//isEmpty() = 文字の長さが０かを調べる(０ならtrue)
		if (s1.isEmpty()) {
			System.out.println("空文字です");
		}
	}
}
