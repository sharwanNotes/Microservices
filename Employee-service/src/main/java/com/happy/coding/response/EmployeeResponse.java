package com.happy.coding.response;

public class EmployeeResponse {
	 private int id;
	    private String name;
	    private String email;
	    private int salary;
	    private DepartmentResponse departmentResponse;
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
		public DepartmentResponse getDepartmentResponse() {
			return departmentResponse;
		}
		public void setDepartmentResponse(DepartmentResponse departmentResponse) {
			this.departmentResponse = departmentResponse;
		}
		
}
