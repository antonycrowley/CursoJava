package com.antonio.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDB {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/";
	private static final String DATABASE = "login";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USER = "root";
	private static final String PASSWORD = "T3cgurus";
	
	public Connection openConnection() {
		try {
			Class.forName(DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(URL+DATABASE, USER, PASSWORD);
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
