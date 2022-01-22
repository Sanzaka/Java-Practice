package uno;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	ArrayList<ArrayList<String>> hands = new ArrayList<ArrayList<String>>();

	Random random = new Random();

	public void draw() {
		for (int i = 0; i < 100; i++) {

			ArrayList<String> card = new ArrayList<String>();
			//4色、13種類の数字
			String[] color = {"red", "green", "yellow", "blue"};
			card.add(color[random.nextInt(4)]);
			String cardNum = String.valueOf(random.nextInt(13)+1);
			card.add(cardNum);
			//手札に追加
			this.hands.add(card);

		}
		System.out.println(hands.toString());

	}
}
