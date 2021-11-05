package sukkiriNyumon.chapter1_05;

public class Code_Memo {
	public static void main(String[] args) {

		System.out.println("その１");
		//return文の注意点(p204)
		//returnは値を戻すだけでなく、メソッド自体の終了も行う。
		//method1(); <=下部参照
		method1();

		//その２
		//シグネチャ(signature)
		//メソッド名と引数の個数、型、並び順の情報をまとめたものを『シグネチャ』という。
		//public static void 『method(int x, int y)』;


		System.out.println("\nその３");
		//値渡しと参照渡し
		//値渡し
		int x = 3;
		method2(x);
		//説明
		//method2でxに100が加算されているが、このスコープでのxの値は3のまま。
		//これは『値渡し』であり、メソッドを呼び出す際に値がコピーされているため、
		//2つのxは別の存在である。
		System.out.println(x);
		
		//参照渡し
		//メソッド呼び出しの際に、配列を渡すと参照渡しが起こる。
		int[] arr = {1, 2, 3};
		method3(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		//説明
		//参照渡しでは、値ではなくアドレスを変数に渡している。
		//そのため、メソッド内での値の変更がメソッド外でも反映されている。

	}

	public static void method1(){
		System.out.println("一行目");
		return;
		//到達不可能なため、コンパイルエラーになる
		//System.out.println("二行目");
	}

	public static void method2(int x) {
		x += 100;
		//3 + 100が出力される
		System.out.println(x);
	}
	
	public static void method3(int[] arr) {
		arr[0] = 100;
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
