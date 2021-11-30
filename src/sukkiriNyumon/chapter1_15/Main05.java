package sukkiriNyumon.chapter1_15;

public class Main05 {
	public static void main(String[] args) {

		//StringBuilder = 文字列連結など行える。
		//インスタンスを生成して、append("")で追加していく。
		//toString()とすると、appendで追加された文字を出力できる。
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}

		String s = sb.toString();
		
		//また、 + を用いて文字列連結する方法は、上の方法よりもはるかに負荷が高い。
		//多くの文字列連結があるなら、上の方法を用いたほうが良い。
	}
}
