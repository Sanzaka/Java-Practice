package sukkiriNyumon.chapter1_11.practice;

public class Computer extends TangibleAsset{
	String name;
	int price;
	String color;
	String makerName;

	//コンストラクタ
//	public Computer(String name, int price, String color, String makerName) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.makerName = makerName;
//	}

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	//メソッド
	public String getMakerName() { return this.makerName; }
}
