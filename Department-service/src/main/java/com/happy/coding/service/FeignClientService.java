package com.happy.coding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import com.happy.coding.dto.EmployeDTO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;



public class FeignClientService implements FeignClient {
	
	
	@Autowired
	private  FeignClient feignClient;
	
	
	@CircuitBreaker(name = "Department-service",fallbackMethod = "defaultMethod")
	public List<EmployeDTO> getAllEmployees(@PathVariable int depId) {
		return feignClient.getAllEmployees(depId);
	}
	
	public List<EmployeDTO> defaultMethod(int depId,Exception e){
		EmployeDTO emp1 = new EmployeDTO(1, "shravan", "shravan@shravan.com", 1000000, 1001);
		EmployeDTO emp2 = new EmployeDTO(1, "shravan2", "shravan2@shravan2.com", 1000002, 1002);
		return List.of(emp1, emp2);
		
	}

}
