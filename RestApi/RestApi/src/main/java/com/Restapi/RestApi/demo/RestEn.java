package com.Restapi.RestApi.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEn {
	private int id;
	private String name;
	private Long Phone;
	
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
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		this.Phone = phone;
	}
	
}
