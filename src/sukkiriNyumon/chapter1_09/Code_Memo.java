package sukkiriNyumon.chapter1_09;

public class Code_Memo {
	public static void main(String[] args) {
		//その１
//		intやdoubleは【プリミティブ】型であり、変数の場所にそのまま情報が入る。
//		配列型、クラス型、更にString型は【参照型】であり、変数にはアドレスの情報が入る。
		
		// i2にi1を代入。i2の値を変更すると、i1の値に変化があるか確認
		int i1 = 1;
		int i2 = i1;
		i2 = 100;
		System.out.println(i1);
		
		// Stringで同様に試す
		String s1 = "あいうえお";
		String s2 = s1;
		s2 = "かきくけこ";
		System.out.println(s1);
		
		//stringbuffer
		
		//pointer sample
		
		//シャロ―コピー
		
		//ディープコピー
	}
}
