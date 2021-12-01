package sukkiriNyumon.chapter1_15.practice;

public class Practice1 {
	public static void main(String[] args) {

		//1,2,3,,,,99,100と文字列に格納
		StringBuilder str1 = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			str1.append(i + ",");
		}
		System.out.println(str1.toString());

		// , で区切り、それぞれを配列に格納
		String str2 = str1.toString();
		String[] numbers = str2.split("[,:]");
		for (String n : numbers) {
			System.out.println(n);
		}
	}
}
