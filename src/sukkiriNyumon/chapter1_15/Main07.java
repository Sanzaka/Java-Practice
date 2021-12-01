package sukkiriNyumon.chapter1_15;

public class Main07 {
	public static void main(String[] args) {
		String s = "adc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}
	}
}
