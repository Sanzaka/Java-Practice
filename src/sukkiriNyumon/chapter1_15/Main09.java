package sukkiriNyumon.chapter1_15;

public class Main09 {
	public static void main(String[] args) {
		final String FORMAT = "%-9s %-10s 所持金%,6d";
		String name = "あああ";
		String job = "勇者";
		int gold = 1000;
		String s = String.format(FORMAT, name, job, gold);
		System.out.println(s);
		System.out.printf(FORMAT, name, job, gold);

		System.out.printf("製品番号%s-%04d", "SJV", 3);
	}
}
