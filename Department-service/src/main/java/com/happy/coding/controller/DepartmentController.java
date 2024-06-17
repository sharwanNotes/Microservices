package com.happy.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happy.coding.dto.DepartmentDTO;
import com.happy.coding.dto.EmployeDTO;
import com.happy.coding.entity.Department;
import com.happy.coding.service.DepartmentService;
import com.happy.coding.service.FeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping()
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private FeignClient feignClient;

	
	//http://localhost:8090/api/departments
	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/getDepartemnt/{depId}")
	@CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "createFallbackmethod")
	public DepartmentDTO getDepartment(@PathVariable int depId) {
		
		Department department=departmentService.getDepartment(depId);
		List<EmployeDTO> listEmployeDTO=feignClient.getAllEmployees(department.getDeptId());
		System.out.println("Size"+listEmployeDTO.size());
		DepartmentDTO departmentDTO=new DepartmentDTO();
		departmentDTO.setDeptId(department.getDeptId());
		departmentDTO.setDeptName(department.getDeptName());
		departmentDTO.setEmployeDTO(listEmployeDTO);
		 
		 return departmentDTO;
		
	}
	
	
	
	// create CircuitBreaker method
	public DepartmentDTO createFallbackmethod(Exception e) {
		System.out.println("Get Problem for Services");
		DepartmentDTO deptDTOs = new DepartmentDTO();
		return deptDTOs;

	}

}
