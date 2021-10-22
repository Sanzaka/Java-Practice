
public class curriculum06 {
	public static void main(String[] args) {
//		演算子＝ +, -など　オペランド＝数字や変数など、計算対象のもの
//		算術演算子
		int a = 15;
		int c;
		c = a + 3;
		c = a - 5;
		c = a * 2;
		c = a / 6;
		c = a % 4;

//		インクリメント ++　デクリメント --
		int a2;
		a2 = 10;
		a2++; //11になる

		a2 = 10;
		a--;	//9になる

//		インクリメント、デクリメント、前置と後置
		a = 5;
		c = ++a;	//インクリメントした後に、aがcに代入される。c = 6

		a = 5;
		c = a++;	//インクリメントする前に、aがcに代入される。c = 5

//		代入演算子
		a = 10;
		a += 5;		//a = 15
		a -= 3;		//a = 12
		a *= 4;		//a = 48
		a /= 2;		//a = 24
		a %= 7;		//a = 3

//		比較演算子　結果はboolean型になる。boolean型の変数をあらかじめ用意すること。
		a = 5;
		boolean b;

		b = a < 5;		//c = false
		b = a <= 5;		//c = true

//		文字列の等価比較
		String aa = "applePie";
		String bb = "applePie";
		b = aa == bb;	//true

//		文字列の等価比較　注意
		String aaa = "applePie";
		String bbb = "apple";
		String ccc = bbb + "Pie";
		b = aaa == ccc;		//false

//		文字列を比較する場合はequalsメソッドを利用すること。
		b = aaa.equals(ccc);
	}
}
