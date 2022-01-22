package postgreSQL;

import java.sql.SQLException;

public class Main {
	public static void main(String args[]) {

		try{
			Create c = new Create();
		} catch (SQLException e) {
			System.out.println("エラー発生");
		}

	}
}
