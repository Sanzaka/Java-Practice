package postgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create implements SqlBase {

	public Create() throws SQLException{
		//PostgreSQLへ接続
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		//自動コミットoff
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

		System.out.println("実行しました。");
	}
}
