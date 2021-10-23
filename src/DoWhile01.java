
public class DoWhile01 {
	public static void main(String[] args) {
//		DoWhileの場合、処理を実行してから繰り返しの判断をする。
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}
}
