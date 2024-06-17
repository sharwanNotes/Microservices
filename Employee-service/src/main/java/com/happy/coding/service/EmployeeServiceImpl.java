package com.happy.coding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.happy.coding.entity.Employee;
import com.happy.coding.feignclient.DepartmentClient;
import com.happy.coding.repository.EmployeeRepository;
import com.happy.coding.response.DepartmentResponse;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeRepository employeeRepository;
	
	 
	 
    @Override
    public List<Employee> getAllEmployees(int depId) {
    	List<Employee> employeeList=employeeRepository.getEmployeList(depId);
	return employeeList;
    }

}
