package com.happy.coding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.coding.entity.Department;
import com.happy.coding.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartment(int depId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(depId).get();
	}
}
