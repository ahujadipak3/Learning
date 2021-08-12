package com.sample.programs;

public class Employee {
	private int age;
	private String name;
	private Long salary;
	
	public Employee(int age, String name, Long salary) {
		this.age = age;
		this.name = name; 
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public Long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
