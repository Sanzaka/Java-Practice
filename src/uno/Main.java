package uno;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("ゲームが始まります。コンピュータは何人用意しますか？");

		//プレーヤーの用意
		Player player = new Player();

		//cpuの用意
		Scanner scan = new Scanner(System.in);
		int addMember = scan.nextInt();
		Player[] cpu = new Player[addMember];
		for(int i = 0; i < cpu.length; i++)
			cpu[i] = new Player();

		//カードのドロー
		System.out.println("カードを引きます");
		System.out.println("プレイヤー");
		for (int i = 0; i < 6; i++) {
			player.draw();
		}

		System.out.println(player.hands.toString());

		System.out.println("CPU");
		for (int i = 0; i < cpu.length; i++) {
			for (int j = 0; j < 6; j++) {
				cpu[i].draw();
			}
			System.out.println(cpu[i].hands.toString());
		}

	}
}

