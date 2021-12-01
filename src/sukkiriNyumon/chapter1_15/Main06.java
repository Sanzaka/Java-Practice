package sukkiriNyumon.chapter1_15;

public class Main06 {
	public static void main(String[] args) {
		String s = "Java";

		//matches("") = 一致していたらtrueを返す
		System.out.println(s.matches("Java"));

		// ... = .の位置は何が入ってもよい
		System.out.println(s.matches("J..."));

		// * = *の位置はどの文字が何文字入ってもよい
		System.out.println("Javvvvvvva".matches("Jav*a"));

		//{} = {}の中の数字文だけ、前の文字が繰り返されているとtrue
		System.out.println("Jaaaaava".matches("Ja{5}va"));

		//[] = []の部分のどの文字が入っていてもよい
		System.out.println("Jaba".matches("Ja[vbc]a"));

		//[-] = -で挟んである文字と、その間の文字は有効（a~zまで有効、それが3文字）
		System.out.println("java".matches("[a-z]{4}"));

		//定義済みの文字クラスについて
		//多用されるパターンは簡単に使えるように定義されている。
		// \b = いずれかの数字
		// \w = 英字、数字、アンダーバー
		// \s = 空白文字（スペース、タブ文字、改行文字など）

		System.out.println("13".matches("\\d{2}"));
	}
}
