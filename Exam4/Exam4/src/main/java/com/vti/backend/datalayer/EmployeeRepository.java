package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.utils.JdbcUtils;

public class EmployeeRepository {
	JdbcUtils jdbcUtils = new JdbcUtils();
	
	public Employee getEmployeesById(int id) throws SQLException, FileNotFoundException, ClassNotFoundException, IOException{
		
		String sql = "SELECT * FROM employee WHERE id=?";
		PreparedStatement pStatement = jdbcUtils.preparedStatement(sql);
		pStatement.setInt(1, id);
		ResultSet rSet = pStatement.executeQuery();
	
		if(rSet.next()) {
			Employee employee = new Employee(rSet.getInt(1), rSet.getString(2), rSet.getString(2), rSet.getString(3), rSet.getString(4), rSet.getInt(5));
			return employee;
		}else {
			jdbcUtils.disConnection();
			return null;
		}
	}
}
