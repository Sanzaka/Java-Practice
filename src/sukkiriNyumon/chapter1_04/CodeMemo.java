package sukkiriNyumon.chapter1_04;

public class CodeMemo {
	public static void main(String[] args) {
		
		//その１
		//変数の値を取り出す前に、必ず数値を代入していなければならない。
		int x;
		//System.out.println(x); <=エラー発生
		
		//しかし、配列（int型）の場合は、０の値で自動的に初期化される。
		int[] arr = new int[5];
		System.out.println(arr[2]);	// <=　０が入っている
		
		// string型配列の初期値
		String[] str = new String[5];
		System.out.println(str[2]); // <=　nullが入っている
		
		// boolean型配列の初期値
		boolean[] bool = new boolean[5];
		System.out.println(bool[2]); //　falseが入っている
		
		//その２
		//配列の仕様について(p164~)
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		//=> 100が出力される。
		//この仕様について
		/*コンピュータは使用する情報をメモリに記録する。
		 *各メモリの区画にはアドレスが割り振られている。  
		 *arrayB = arrayAという操作は、
		 *arrayAをコピーするのではなく、arrayAのアドレスをarrayBと共有するという動作になる。
		 *そのため、arrayBでの変更が、arrayAでも適用された状態になっている。
		 * */
		
		//その３
		//lengthとlength()について
		//lengthは配列に使う。配列の要素数をカウントする。
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(arr1.length);
		
		//length()は文字列の文字数をカウントする
		String str1 = "すとりんぐ";
		System.out.println(str1.length());
	}
}
