package sukkiriNyumon.chapter1_03;

public class CodeMemo {
	public static void main(String[] args) {
		
		//その１
		//文字列の比較を行う場合、関係演算子（==）を使ってはならない。
		String str = "あいうえお";
		if (str.equals("あいうえお"));
		if (str.equals("かきくけこ"));
		
//		その２
//		否定型の条件式を作りたい場合、以下のように記述する
//		if (!("条件式"))
		if (!(str.equals("かきくけこ")));
		
//		その３
//		比較表現は一つずつ記入する。
		int x = 5;
//		if (5 <= x <= 20); <=　NG例
		if (5 <= x && x <= 20);
		
		//その４
		//break文は繰り返しの即時終了
		//continue文は、現ループのスキップ
		System.out.println("その４");
		
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				//i == 2の時、for文が即時終了
				break;
			}
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				//i == 2の時、そのループが終了し、可能であれば次のループを行う
				continue;
			}
			System.out.println(i);
		}
		
		//その５　三項演算子
		//if文よりも更に簡潔に表現することができる。
		//(変数 関係代名詞 値 ? "" : "")
		System.out.println("その５");
		
		int i = 7;
		//if文を使った表現（5行）
//		if (i == 0) {
//			System.out.println("ゼロです");
//		} else {
//			System.out.println("ゼロ以外です");
//		}
		//三項演算子を用いた表現（1行！）
		System.out.println(i == 0 ? "ゼロです" : "ゼロ以外です");
	}
}
