package com.farmfresh.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

	public Connection returnConnection(){

		String dbName = "OracleDB";
		String userName = "system";
		String password = "test123";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1522:" + dbName, userName,
					password);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		if (connection != null) {
			return connection;
		} else {
			return null;
		}
	}
	


}
