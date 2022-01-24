package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player {
	ArrayList<String> hands = new ArrayList<String>();
	Random random = new Random();

	public void draw() {
			//4色、13種類の数字
			//color = 赤、緑、黄色、青
			String[] color = {"\u001b[00;41m \u001b[00;30m", "\u001b[00;42m \u001b[00;30m", "\u001b[00;43m \u001b[00;30m", "\u001b[00;44m \u001b[00;30m"};
			String end = "\u001b[00m";

			int cardNum = random.nextInt(25)+1;
			if(cardNum > 12) {
				cardNum -= 12;
			}

			String cardCts = String.valueOf(cardNum);

			//特殊カード割り当て
			switch(cardCts) {
			case("10"):
				cardCts = "Skip";
				break;
			case("11"):
				cardCts = "Draw2";
				break;
			case("12"):
				cardCts = "Reverse";
				break;
			case("13"):
				cardCts = "Wild";
				break;
			}
			//wildは黒色で表示
			if (cardCts.equals("Wild")) {
				hands.add(cardCts);
			} else {
			//wild以外は各色表示
				hands.add(color[random.nextInt(4)]
						+ cardCts
						+ end);
			}
			//整列表示
			Collections.sort(hands);

	}

	public void choice(Player p, Field f) {
//		System.out.println("出すカードを選択してください");
//
//		//出せるカードと出せないカードを分けて表示
//		for (String card : p.hands) {
//			if (card == )
//		}
  	}
}
