package sukkiriNyumon.chapter1_15;

public class Main08 {
	public static void main(String[] args) {
		String s = "abs,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}
}
