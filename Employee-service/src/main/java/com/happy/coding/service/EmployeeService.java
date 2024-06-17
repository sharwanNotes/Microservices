package com.happy.coding.service;

import java.util.List;

import com.happy.coding.entity.Employee;

public abstract interface EmployeeService {
	public abstract List<Employee> getAllEmployees(int depId);
   
}
