package com.cassandra.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.rest.dao.EmployeeDAO;
import com.cassandra.rest.service.EmployeeService;
import com.cassandra.rest.util.entity.StudentInfo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;

	/**
	* Default Constructor
	*/
	public EmployeeServiceImpl() {
	super(); 
	}

	@Override 
	public StudentInfo createEmployee(StudentInfo employee) { 
	return employeeDAO.createEmployee(employee);
	}

	@Override 
	public StudentInfo getEmployee(int id) { 
	return employeeDAO.getEmployee(id);
	}

	@Override 
	public StudentInfo updateEmployee(StudentInfo employee) { 
	return employeeDAO.updateEmployee(employee);
	}

	@Override 
	public void deleteEmployee(int id) { 
	employeeDAO.deleteEmployee(id);
	}

	@Override 
	public List<StudentInfo> getAllEmployees() { 
	return employeeDAO.getAllEmployees();
	}
}
