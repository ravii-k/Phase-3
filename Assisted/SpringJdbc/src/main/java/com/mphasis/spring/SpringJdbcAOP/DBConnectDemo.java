package com.mphasis.spring.SpringJdbcAOP;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectDemo {
static Connection con = null;
	public static void main(String[] args) throws Exception {
		getConnection();
	}

	public static void getConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "Ravi_admin";
		String password = "tiger";

		con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection success");
		

	}
	
	}
