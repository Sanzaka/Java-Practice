package sukkiriNyumon.chapter1_08;

public class Hero {
	public String name;
	public int hp;
	public Sword sword;

	public void attack() {
		System.out.println(this.name + "は" + sword.name + "で相手を攻撃した！");
		System.out.println("相手に" + sword.damage + "ダメージを与えた！");
	}

	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した" );
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	//コンストラクタ。newされたときに自動的に実行される。
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	//new時に引数を用意しなかった場合、こちらが実行される。（オーバーロード）
	public Hero() {
		this("ダミー");
	}
}
