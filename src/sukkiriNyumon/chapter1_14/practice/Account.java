package sukkiriNyumon.chapter1_14.practice;

public class Account {
	String accountNumber;
	int balance;

	public void denote(String accountNumber, int balance) {
		System.out.println("\\" + balance + "(口座番号:" + accountNumber + ")");
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Account) {
			Account a = (Account)obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
