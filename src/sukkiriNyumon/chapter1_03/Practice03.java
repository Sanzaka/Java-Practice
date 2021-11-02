package sukkiriNyumon.chapter1_03;

public class Practice03 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "ラーメン";
		System.out.println("こんにちは");
		
		switch (isHungry) {
		case 0:
			System.out.println("おなかがいっぱいです");
			break;
		case 1:
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		
		System.out.println("ごちそうさまでした");
	} 
}
