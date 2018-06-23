package com.antonio.login.dao;

public class DAOFactory {
	
	public static MySqlDB getMySqlDB() {
		return new MySqlDB();
	}

}
