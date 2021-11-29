package sukkiriNyumon.chapter1_14;

public class Main01 {
	public static void main(String[] args) {
		Empty e = new Empty();
		
		//暗黙の継承
		//extendsで親クラスを指定していなければ、java.lang.Objectを継承したとみなされる。
		String s = e.toString();
		//toString のほかに equals()も使える
		
		System.out.println(e);
	}
}
