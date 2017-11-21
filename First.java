package com.javapoint.myDBtest;

import java.sql.SQLException;

public class First {
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String args[]) throws SQLException{
		Testconnection tc = new Testconnection();
		tc.insertRecord();
		System.out.println("inserted into db");
	}
}
