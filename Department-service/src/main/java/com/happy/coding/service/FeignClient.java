package com.happy.coding.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.happy.coding.dto.EmployeDTO;

@org.springframework.cloud.openfeign.FeignClient(name="Employee-service", url = "http://localhost:8090")
public interface FeignClient {
	
	@GetMapping("/employees/{depId}")
	public List<EmployeDTO> getAllEmployees(@PathVariable int depId) ;

}
