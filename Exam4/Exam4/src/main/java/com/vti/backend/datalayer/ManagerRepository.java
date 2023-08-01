package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.utils.JdbcUtils;

public class ManagerRepository {
	JdbcUtils jdbcUtils = new JdbcUtils();
	
	public List<Manager> getListManager() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException{
		
		String sql = "SELECT * FROM manager";
		ResultSet resultSet = jdbcUtils.executeQuery(sql);
		List<Manager> managers = new ArrayList<Manager>();
		while(resultSet.next()) {
			Manager manager = new Manager();
			manager.setId(resultSet.getInt(1));
			manager.setFullName(resultSet.getString(2));
			manager.setEmail(resultSet.getString(3));
			manager.setPassWord(resultSet.getString(4));
			manager.setProjectId(resultSet.getInt(5));
			manager.setNumberYear(resultSet.getInt(6));
			managers.add(manager);
		}
		jdbcUtils.disConnection();
		return managers;
	}
}
