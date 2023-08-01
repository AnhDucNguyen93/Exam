package com.vti.frontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.JdbcUtils;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
//		EmployeeFunction.getEmpolyByid();
		JdbcUtils jdbcUtils = new JdbcUtils();
		jdbcUtils.getConnection();
	}
}
