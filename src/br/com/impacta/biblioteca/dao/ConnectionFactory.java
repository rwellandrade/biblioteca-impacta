package br.com.impacta.biblioteca.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			Class.forName("com.jdbc.mysql.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/impacta","impacta","impacta");			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
