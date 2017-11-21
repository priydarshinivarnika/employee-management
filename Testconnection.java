package com.javapoint.myDBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testconnection {

	Connection con;
	Statement st;
	ResultSet rs;

	public static void main(String args[]) {
		Testconnection tc = new Testconnection();
		try {
			tc.insertRecord();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted into db");
	}

	public void insertRecord() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			st = con.createStatement();
			String sql = "INSERT INTO TEST_CON(STATUS) VALUES ('" + "OK" + "')";
			st.executeUpdate(sql);
			System.out.println("inserting");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
			st.close();
		}
	}
}	