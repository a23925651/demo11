package com.example.demo11;

public class Employee {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	//把自定義的整個HomeTown類當成Employee的屬性
	private HomeTown hometown;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, int age, String gender, HomeTown hometown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hometown = hometown;
	}

	
	

}
