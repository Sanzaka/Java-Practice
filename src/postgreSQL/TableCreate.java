package postgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate extends SqlBase{
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "0815Equation";

		try {

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			conn.setAutoCommit(false);

			//テーブル作成2種作成
			String sql = "CREATE TABLE IF NOT EXISTS itemType"
					+ "(name varchar(20) primary key)";

			stmt.executeUpdate(sql);
			conn.commit();

			sql = "CREATE TABLE IF NOT EXISTS purchases "
					+ "(id integer, "
					+ "category varchar(20), "
					+ "price integer, "
					+ "purchaseDate date,"
					+ "foreign key(category) references itemType(name))";

			stmt.executeUpdate(sql);
			conn.commit();

		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
