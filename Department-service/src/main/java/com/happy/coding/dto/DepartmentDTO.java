package com.happy.coding.dto;

import java.util.List;

public class DepartmentDTO {
	
	private int deptId;
	private String deptName;
	
	private List<EmployeDTO> employeDTO;

	public List<EmployeDTO> getEmployeDTO() {
		return employeDTO;
	}

	public void setEmployeDTO(List<EmployeDTO> employeDTO) {
		this.employeDTO = employeDTO;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
