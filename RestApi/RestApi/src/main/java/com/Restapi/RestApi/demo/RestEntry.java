package com.Restapi.RestApi.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEntry {
	private int id;
	private String Name;
	private Long age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
}
