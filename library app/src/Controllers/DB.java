package Controllers;

import java.sql.*;

public class DB {

	public static Connection conn = null;

	public static Connection connect() throws SQLException {

		if (conn == null) {
			String host = "localhost";
			String database = "master";
			String user = "sa";
			String password = "saikoo";
			String url = "jdbc:sqlserver://" + host + ":1433;" + ";DatabaseName=" + database +
					";encrypt=true;trustservercertificate=true";
			conn = DriverManager.getConnection(url, user, password);
		}

		return conn;
	}

}
