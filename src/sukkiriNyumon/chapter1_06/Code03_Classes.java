package sukkiriNyumon.chapter1_06;

public class Code03_Classes {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = Code02_Classes.tasu(a, b);
		int delta = Code02_Classes.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);
	}
}
