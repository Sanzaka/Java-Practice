package sukkiriNyumon.chapter1_02;

public class Code15 {
	public static void main(String[] args) {
		System.out.println("あなたの名前は？");
		
		// name変数に、コンソールからの入力を受けて代入する。
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("あなたの年齢は？");
		
		//　intの場合は、最後の部分をnextIntにする
		int age = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("あなたの名前は、" + name + "、年齢は" + age + " です。");
	}
}
