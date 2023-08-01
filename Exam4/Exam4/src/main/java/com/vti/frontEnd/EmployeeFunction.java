package com.vti.frontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.sun.xml.internal.stream.Entity.ScannedEntity;
import com.vti.backend.datalayer.EmployeeRepository;
import com.vti.entity.Employee;
import com.vti.utils.ScannerUltis;

public class EmployeeFunction {
	
	public static void getEmpolyByid() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		System.out.println("Tim kiem Employee theo Id");
		System.out.println("Nhap Id can tim kiem");
		
		int idFind = ScannerUltis.inPutInt();
		EmployeeRepository eRepository = new EmployeeRepository();
		Employee employee = eRepository.getEmployeesById(idFind);
		if (employee!= null) {
			System.out.println(employee);
		}

	}
}
