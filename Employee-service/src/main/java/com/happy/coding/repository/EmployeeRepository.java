package com.happy.coding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.happy.coding.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	@Query(value="select * from employee where dept_id=:depId", nativeQuery = true)
	List<Employee> getEmployeList(int depId);

}
