package com.cassandra.rest.dao;

import java.util.List;

import com.cassandra.rest.util.entity.StudentInfo;


public interface EmployeeDAO {
	/**
	 * Used to Create the Employee Information
	 * 
	 * @param employee
	 * @return {@link StudentInfo}
	 */
	public StudentInfo createEmployee(StudentInfo employee);

	/**
	 * Getting the Employee Information using Id
	 * 
	 * @param id
	 * @return {@link StudentInfo}
	 */
	public StudentInfo getEmployee(int id);

	/**
	 * Used to Update the Employee Information
	 * 
	 * @param employee
	 * @return {@link StudentInfo}
	 */

	public StudentInfo updateEmployee(StudentInfo employee);

	/**
	 * Deleting the Employee Information using Id
	 * 
	 * @param id
	 */
	public void deleteEmployee(int id);

	/**
	 * Getting the All Employees information
	 * 
	 * @return
	 */
	public List<StudentInfo> getAllEmployees();
}
