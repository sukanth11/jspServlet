package com.voya.employee;

public class Employee {
	
	private String employeeName;
	private Integer employee;
	private double salary;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, Integer employee, double salary, String city) {
		super();
		this.employeeName = employeeName;
		this.employee = employee;
		this.salary = salary;
		this.city = city;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployee() {
		return employee;
	}
	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employee=" + employee + ", salary=" + salary + ", city="
				+ city + "]";
	}
	
}
