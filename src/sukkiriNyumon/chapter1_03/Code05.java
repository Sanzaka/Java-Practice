package sukkiriNyumon.chapter1_03;

public class Code05 {
	public static void main(String[] args) {
//		switch文で分岐させる条件
//		１、一致するかを比較する式であること
//		２、比較する値が『整数か文字列』。少数や真偽値では不可能。
		int fortune = new java.util.Random().nextInt(4) + 1;
		
//		switch文始動
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		default:
			System.out.println("凶");
		}
	}
}
