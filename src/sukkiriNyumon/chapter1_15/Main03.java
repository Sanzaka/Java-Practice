package sukkiriNyumon.chapter1_15;

public class Main03 {
	public static void main(String[] args) {
		String s1 = "Java programing";
		
		//substring() = 引数の数字以降の文字を抜き出す。例であれば、4文字以降を抜き出す。(4文字目を含む)
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3)); 
		
		
		//substring(int1, int2) = 引数が2つあれば、文字数にしてint1~int2までの文字を抜き出す。
		//次の例では4文字目~7文字目までが出力される。8文字目は含まない
		System.out.println("文字列s1の4~8行目は" + s1.substring(3, 8));
	}
	
	
}
