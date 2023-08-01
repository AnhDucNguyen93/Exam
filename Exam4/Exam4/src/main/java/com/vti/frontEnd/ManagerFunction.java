package com.vti.frontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.ManagerRepository;

public class ManagerFunction {
	
	public static void getListManager() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		ManagerRepository mRepository = new ManagerRepository();
		mRepository.getListManager();
	}
}
