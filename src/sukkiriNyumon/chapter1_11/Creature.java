package sukkiriNyumon.chapter1_11;

//最も抽象的なクラス、インターフェイス
public interface Creature {
	
	//インターフェイスでフィールド宣言すると、public static finalが付き、
	//定数となる。
	double PI = 3.141592;
	
	//interfaceでは、publicとabstractは省略できる。
	void run();
}
