package sukkiriNyumon.chapter1_15;

public class Main06 {
	public static void main(String[] args) {
		String s = "Java";

		System.out.println(s.matches("Java"));

		System.out.println(s.matches("J..."));

		System.out.println("Javvvvvvva".matches("Jav*a"));

		System.out.println();
	}
}
