package forJavaBronze;

public class Valiable {
	//8進数 = 先頭に0を着ける
	int eight = 071;
	
	//16進数 = 先頭に0xを着ける
	int sixteen = 0xaa;
	
	//2進数 = 先頭に0bをつける
	int two = 0b1010;
	
	//指数表記 = 数値の後ろにeを置き、更に後ろに0の個数を整数で記入する
	//注意、double指定でなければならない
	double notation = 3e5; // => 300000
	
	//------
	//
	//
	//文字リテラル
	//unicodeについて
	//\ uの後ろに4桁の16進数を指定すると、1文字を表すunicode値になる。
	char char1 = '\u0030';
	
	//数値の範囲について
	//byteの値 -128 ~ 127
	//shortの値 -32768 ~ 32767
	//intの値 -2147483648 ~ -2147483647 (約21.4億)
	
	//long floatに着ける文字について
	float float1 = 0.1F;
	//最初にdouble型で認識してから、floatに変換する。
	//Fがないとコンパイルエラー
	
	long long1 = 1029; 
	long long2 = 10000000000L; 
	//intで扱えるなら、Lをつけなくていい
	//intで扱えない値なら、Lを付けないとコンパイルエラー
	
	//識別子、予約語
	//最初の文字はa~z,A~Z, $, _、2文字目からは数字も使用可能。予約語を大文字にしても使える。
	//emp1, CHAR, _emp　これらの予約語は使える。
	
	//配列
//	[]int array1;　＝＞コンパイルエラー
	int[] array2 = new int[50];
	int []array3;
	int array4[];
	char[] charArray = {'A', 'B', 'C'};
	String[] strArray = {"asdf", "asdf", "asdf"};
	
//	型の先頭以外のみ、[]を設置不可
//	System.out.println(charArray) => ABCが出力される
	//char型配列のみ、配列を出力してもそのまま文字が出力できる。
	//その他配列は、参照のアドレスが出力される。（配列の中の値は表示されない。）
	
	//------
	//中身が宣言されていない（初期化されていない）変数を使用すると、コンパイルエラー
//	int i;
//	Syso(i) =>コンパイルエラー
	
//	配列の場合は、宣言と同時に初期化される。
	int[] intArray1 = new int[1];
//	syso(intArray1[0]) => 0が出力される
	
	//作成した配列以上の番号を指定すると、実行時エラー（コンパイルエラーとは別）
//	syso(intArray1[5])  => 実行時エラー
	
	//コマンドライン引数について
	//コマンドライン引数で数値を入力し、コマンドライン引数同士で足し算をしても、
	//処理としては文字列扱いである。数値にしたければInteger.parseIntを用いる。
	
	//ーーーーーー練習問題
	//CE, C, CD ABDG, ACEF, D, ADE, ABC, D, C, B, D, A
	
	//ーーーーー発見
	//booleanは参照型
	//
//	配列であれば、参照型はnullがデフォルト値。さらにbooleanであれば、自動的にfalseに代わる。
	
//	コマンドライン引数について、【args[1] = 4】　のように渡してもエラーにはならない。
//	args[1], =, 4の3つに区別されるため、args[1]の値は【=】となる。
}
