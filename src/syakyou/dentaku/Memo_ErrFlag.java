package syakyou.dentaku;

public class Memo_ErrFlag {
	public static void main(String[] args) {
		
		//愚直にifで一つ一つ確認
		boolean errFlag = true;
		String ope = args[1]; 
		
		if (ope.equals("kake")) {
			errFlag = false;
		}
		
		if (ope.equals("waru")) {
			errFlag = false;
		}
		
		if (ope.equals("tasu")) {
			errFlag = false;
		}
		
		if (ope.equals("hiku")) {
			errFlag = false;
		}
		
		// if階層で確認
		errFlag = false;
		if (!ope.equals("kake")) {
			if (!ope.equals("waru")) {
				if (!ope.equals("tasu")) {
					if (!ope.equals("hiku")) {
						errFlag = true;
					}
				}
			}
		}
		
		// if文を更に効率化
		if (ope.equals("kake") || ope.equals("waru") || ope.equals("tasu") || ope.equals("hiku")) {
			errFlag = false;
		}
	}
}
