package forJavaBronze;

public class Operator {
	public static void main(String[] args) {
		System.out.println("浮動小数点を含む計算");
		System.out.println("10 / 3 = " + 10/3);
		System.out.println("10 / 3.0 = " + 10/3.0);
		System.out.println("(10 + 5.0) = " + (10 + 5.0));
		//演算に浮動小数点が含まれると、計算結果も浮動小数点込みで出力される。

		System.out.println("\nString + int + int の出力");
		System.out.println("文字列 + 10 + 10 = " + "文字列" + 10 + 10);
		//string + int + int の場合、string + int = string, string + int = string
		//このように、＋は左から右へと計算し、順に処理されるため、intの足し算が行われず、1010と文字列として表示される。


	}
}
