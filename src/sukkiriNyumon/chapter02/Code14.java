package sukkiriNyumon.chapter02;

public class Code14 {
	public static void main(String[] args) {
		
		//コード2-14 乱数を出力する
		//0~100までが出現する
		int r = new java.util.Random().nextInt(101);
		System.out.println(r);
		
		//定義した段階で、乱数が固定されるため、うえと同じ数字が出力される。
		System.out.println(r);
		
		//再代入すると、別の数値が出力される。
		r = new java.util.Random().nextInt(101);
		System.out.println(r);
	}
}
