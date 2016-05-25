package com.cassandra.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cassandra.rest.dao.EmployeeDAO;
import com.cassandra.rest.util.MyCassandraTemplate;
import com.cassandra.rest.util.entity.StudentInfo;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public StudentInfo createEmployee(StudentInfo employee) {
		return myCassandraTemplate.create(employee);
	}

	@Override
	public StudentInfo getEmployee(int id) {
		return myCassandraTemplate.findById(id, StudentInfo.class);
	}

	@Override
	public StudentInfo updateEmployee(StudentInfo employee) {
		return myCassandraTemplate.update(employee, StudentInfo.class);
	}

	@Override
	public void deleteEmployee(int id) {
		myCassandraTemplate.deleteById(id, StudentInfo.class);
	}

	@Override
	public List<StudentInfo> getAllEmployees() {
		return myCassandraTemplate.findAll(StudentInfo.class);
	}
}