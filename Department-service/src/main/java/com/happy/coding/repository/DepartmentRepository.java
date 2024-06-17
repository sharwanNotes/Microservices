package com.happy.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happy.coding.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
