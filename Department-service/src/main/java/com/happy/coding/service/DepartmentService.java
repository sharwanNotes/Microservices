package com.happy.coding.service;

import java.util.List;

import com.happy.coding.entity.Department;

public interface DepartmentService {
	public abstract List<Department> getAllDepartments();

	public abstract Department getDepartment(int depId);
	
}
