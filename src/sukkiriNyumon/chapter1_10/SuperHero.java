package sukkiriNyumon.chapter1_10;

public class SuperHero extends Hero{
	boolean flying = false;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	//attackをオーバーライド
	public void attack() {

		// super = 親クラスのメソッド参照
		super.attack();
		if (this.flying == true) {
			//飛んでいるなら二度攻撃
			super.attack();
		}

	}
}
