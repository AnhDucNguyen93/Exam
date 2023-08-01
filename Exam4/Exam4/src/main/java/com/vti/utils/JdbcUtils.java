package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.sun.swing.internal.plaf.basic.resources.basic;

public class JdbcUtils {
	private Connection connection;
	private Properties pro;

	public Connection getConnection() throws SQLException, FileNotFoundException, IOException, ClassNotFoundException {
		pro = new Properties();
		pro.load(new FileInputStream("resources/database.properties"));
		
		String url = pro.getProperty("url");
		String user = pro.getProperty("username");
		String password = pro.getProperty("password");
		String driver = pro.getProperty("driver");
		Class.forName(driver);
		connection = DriverManager.getConnection(url,user,password);
		System.out.println("Thanh cong");
		return connection;
	}
	public void disConnection() throws SQLException {
		connection.close();
	}
	public ResultSet executeQuery(String sql) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		return resultSet;
	}
	public PreparedStatement preparedStatement(String sql) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		return preparedStatement;
	}
}
