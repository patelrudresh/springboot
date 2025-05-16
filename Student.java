package com.example.Demo10;

public class Student {
	private String Name;
	
	private String Lastname;

	public Student(String name, String lastname) {
		super();
		Name = name;
		Lastname = lastname;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	

}
