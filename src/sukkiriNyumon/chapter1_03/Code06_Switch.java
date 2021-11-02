package sukkiriNyumon.chapter1_03;

public class Code06_Switch {
	public static void main(String[] args) {
//		switch文で、あえてbreakを書かないテクニックについて
		
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1:
		case 2:
			//caseが1か2の場合の処理
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん");
		}
	}
}
