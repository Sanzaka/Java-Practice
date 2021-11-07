package sukkiriNyumon.chapter1_06;

public class Code10_JavaAPI {
	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}
}
