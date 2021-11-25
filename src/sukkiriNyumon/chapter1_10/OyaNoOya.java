package sukkiriNyumon.chapter1_10;

public class OyaNoOya {
	
	//一度もオーバーライドされていないのでアクセス可能
	String base = "オーバーライドしてないよ";
	
	//Koから見て2回オーバーライドしているため、アクセス不可能
	int num = 5;

	public void talk() {
		System.out.println("こんにちは");
	}
}
