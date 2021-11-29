package sukkiriNyumon.chapter1_13.Practice;

import sukkiriNyumon.chapter1_13.Monster;
import sukkiriNyumon.chapter1_13.Sword;

public class Hero {
	//private指定。他クラスからのアクセスはできず、自クラスからのみアクセス可能（sleep, attack）
		private int hp;
		private String name;
		private Sword sword;
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			if (name == null) {
				throw new IllegalArgumentException("名前がnullであるため中断");
			} else if (name.length() <= 1) {
				throw new IllegalArgumentException("短すぎるため中断");
			} else if (name.length() >= 8 ) {
				throw new IllegalArgumentException("長すぎるため中断");
			}
			this.name = name;
		}
		
		public int getHp() {
			return this.hp;
		}
		
		public void setHp(int hp) {
			this.hp = hp;
		}
		
		public void bye() {
			System.out.println("勇者は別れを告げた");
		}
		
		private void die() {
			System.out.println("勇者は死んだ　GAMEOVER");
		}
		
		//　packagePrivate = 同じパッケージしかアクセスできない。
		void sleep() {
			this.hp = 100;
			System.out.println(this.name + "は眠って回復した");
		}
		
		public void attack(Monster m) {
			System.out.println(this.name + "の攻撃");
			System.out.println("からの反撃で2ダメージ受けた");
			
			this.hp -= 2;
			if (this.hp <= 0) {
				this.die();
			}
			
		}
}
