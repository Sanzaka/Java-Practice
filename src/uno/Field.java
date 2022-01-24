package uno;

import java.util.Random;

public class Field {

	String field;
	Random random = new Random();

	public void firstCard() {
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
			field = cardCts;
		} else {
		//wild以外は各色表示
			field = color[random.nextInt(4)]
					+ cardCts
					+ end;

		}
		System.out.println("場のカード = 【 " + field + " 】 ");
	}


}
