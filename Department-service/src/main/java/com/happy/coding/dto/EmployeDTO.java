package com.happy.coding.dto;

public class EmployeDTO {
	
	private int id;
    private String name;
    private String email;
    private int salary;
    private int deptId;
	
	public EmployeDTO(int id, String name, String email, int salary, int deptId) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.deptId = deptId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
