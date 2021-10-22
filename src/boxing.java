
public class boxing {
	public static void main(String[] args) {
		//オートボクシング(17), 明示的なボクシング(18)
		Integer integer1 = 5;
		Integer integer2 = Integer.valueOf(5);
				
		//アンボクシング(21), 明示的なアンボクシング(22)
		int int1 = integer1;
		int int2 = integer2.intValue();
	}
}
