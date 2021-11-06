package sukkiriNyumon.chapter1_05;

public class Practice02 {
	public static void main(String[] args) {
		email("aaa@aaa", "タイトル", "本文");
	}
	
	public static void email(String address, String title, String body) {
		System.out.println(address + "に、以下のメールを送信しました\n件名：" + title + "\n本文：" + body);
	}
} 
