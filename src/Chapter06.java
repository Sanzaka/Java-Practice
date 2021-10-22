
public class Chapter06 {
	public static void main(String[] args) {

//		「int」の変数「val」を「2 足す 5」を演算した結果で初期化して、値を出力
		int val = 2 + 5;
		System.out.println(val);

//		インクリメントした変数「val」の値を出力
		val++;
		System.out.println(val);

//		「5」を掛けた変数「val」の値を出力
		val*=5;
		System.out.println(val);

//		「boolean」の変数「bool」に「valは50と等しい」を演算した結果を代入して、値を出力
		boolean bool;
		bool = val == 50;
		System.out.println(bool);

//		変数「bool」に「valは50より小さい AND valを10で割った余りが0」を演算した結果を代入して、値を出力
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
