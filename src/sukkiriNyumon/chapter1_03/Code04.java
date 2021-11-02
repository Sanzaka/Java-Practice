package sukkiriNyumon.chapter1_03;

public class Code04 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		
//		if文で分岐させる
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		}else if (fortune == 3) {
			System.out.println("吉");
		} else if (fortune == 4) {
			System.out.println("凶");
		}
		
//		Code05で、switch文に切り替える。switch文のほうが簡潔になる。
	}
}
