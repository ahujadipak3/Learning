package com.entitymapping0419.listeners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {

	
	private final Integer id;
	private final String name;
	private final Integer age;
	private List<String> address;
	
	
	public ImmutablePerson(Integer id, String name, Integer age, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = new ArrayList<>();
		this.address.addAll(address);
		//this.address.add("const");
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}


	public List<String> getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "ImmutablePerson [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
}
