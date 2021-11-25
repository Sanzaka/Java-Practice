package sukkiriNyumon.chapter1_10;

public class PoisonMatango extends Matango{
	int limited = 5;


	public PoisonMatango(char suffix) {
		super(suffix);
	}

	@Override
	public void attack(Hero h) {
		super.attack(h);

		if (this.limited > 0) {
			this.poisonAttack(h);
		} else {
			System.out.println("その技はもう使えない！");
		}

	}

	public void poisonAttack(Hero h) {
		int poisonDamage = (int)(h.hp * 0.2);

		System.out.println("さらに毒の胞子をばらまいた！");
		System.out.println(poisonDamage + "ポイントのダメージ！");
		h.hp -= poisonDamage;

		this.limited--;
	}
}
