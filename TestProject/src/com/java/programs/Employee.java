package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	private Long id;
	private String name;
	private String deptName;
	private boolean isActive;

	public Employee(Long id, String name, String deptName, boolean isActive) {
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", deptName='" + deptName + '\'' + ", isActive="
				+ isActive + '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public static void main(String[] args) {
		List<Employee> myEmpList = Arrays.asList(new Employee(1L, "Abhishek", "IT", false),
				new Employee(2L, "Aniket", "HR", true), new Employee(3L, "Anshu", "Finance", true),
				new Employee(4L, "Himanshu", "Ops", false), new Employee(2L, "Shyam", "HR", true));
		
		List<Employee> employeeList = myEmpList.stream()
				.filter(e -> (e.isActive() && "HR".equals(e.getDeptName())))
				.map(e -> {
					e.setName(e.getName().toUpperCase());
					return e;
				})
				.collect(Collectors.toList());

		System.out.println(employeeList);
		
		
		Map<String, Long> map = myEmpList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
		
		System.out.println(map);
		
		int x = 892289061;
	}
}
