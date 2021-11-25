package sukkiriNyumon.chapter1_10;

public class Main {
	public static void main(String[] args) {
		
		OyaNoOya a = new OyaNoOya();
		Ko b = new Ko();
		
		//オーバーライド2回しているため、superでもアクセス不可能
		b.talk();
		System.out.println(b.num);
		
		//一度もオーバーライドしていないためアクセス可能
		System.out.println(b.base);
		
	}
}
