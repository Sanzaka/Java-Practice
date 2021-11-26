package sukkiriNyumon.chapter1_11;

public class KyotoCleaningShop implements CleaningService {
		String ownerName;
		String address;
		String phone;

		//シャツを洗う
		public Shirt washShirt(Shirt s) {
			//１５分
			return s;
		}

		public Towl washTowl(Towl t) {
			//10分
			return t;
		}

		public Coat washCoat(Coat c) {
			//ドライ20分
			return c;
		}
	}

