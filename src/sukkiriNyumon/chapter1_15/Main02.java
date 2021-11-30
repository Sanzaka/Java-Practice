package sukkiriNyumon.chapter1_15;

public class Main02 {
	public static void main(String[] args) {

		String s1 = "Java and JavaScript";

		//contains() = ()の中の文字列が含まれているかを調べる
		if (s1.contains("Java")) {
			System.out.println("文字列s1は\"Java\"を含んでいます。");
		}

		//endsWith() = ()の中の文字列で「終わるか」を調べる
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります。");
		}

		//indexOf() = 文字列の最初から()の文字列を検索。見つかった文字数目をintで返す。
		//１文字目は0で帰る
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		// lastIndexOf() = 文字列の最後から()の文字列を検索。見つかった文字数目をintで返す
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

	}
}
