package com.happy.coding.feignclient;

import java.util.List;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.happy.coding.response.DepartmentResponse;

//@FeignClient(name = "department-service", url = "http://localhost:8090", path = "/api/departments")
public interface DepartmentClient {
	 @GetMapping("/api/departments")
	    ResponseEntity<DepartmentResponse> getAllDepartments();
}
