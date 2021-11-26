package sukkiriNyumon.chapter1_11;

public interface Human {
	
	//default = 子のクラスでオーバーライドされていなければ、実装するメソッド
	//interfaceの多重継承による衝突に注意。
	//(2つ以上のinterfaceを継承し、その両方にtalkメソッドのdafaultがあると、エラーになる。)
	default void talk() {
		System.out.println("実装しました");
	}
}
