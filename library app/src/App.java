import java.sql.*;

import Controllers.DB;

public class App {

	public static void main(String[] args) throws SQLException {
		System.out.println("start");

		Connection conn = DB.connect();

		String sql = "select * from saikoo";

		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
		}

	}

}
