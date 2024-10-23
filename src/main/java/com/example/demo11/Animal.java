package com.example.demo11;

public class Animal {
	private String name;

	// 屬性protected，故子類別可直接存取該屬性
	protected int age;
	// 建構方法

	public int getAge() {
		return age;
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
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

	public void eat() {
		System.out.println(name + " 吃東西");
	}

	public void sleep() {
		System.out.println(name + " 吃飽睡");
	}

}
