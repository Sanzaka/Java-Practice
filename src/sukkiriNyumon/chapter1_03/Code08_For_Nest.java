package sukkiriNyumon.chapter1_03;

public class Code08_For_Nest {
	public static void main(String[] args) {
		//forの中にforを入れる。
		//内側のループが終了すれば、外側のループが行われ、また内側のループが行われる。
		
		//九九の一覧表示
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print("　");
			}
			System.out.println();
		}
	}
}
