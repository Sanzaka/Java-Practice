package sukkiriNyumon.chapter1_04;

public class Code18_Array_Multiple {
	public static void main(String[] args) {
		int[][] scores = new int[2][3] ;
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
		
		//このように短縮した表記も可能
		int[][] scores1 = {{1, 2, 3},{4, 5, 6}};
	}
}
