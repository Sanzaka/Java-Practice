package sukkiriNyumon.chapter1_05;

public class Code03_Method {
	
	//mainメソッド以外からでもメソッドを呼び出せる。
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}
	
	public static void main(String[] args) {
		methodA();
	}
}
