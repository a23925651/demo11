package com.example.demo11;

public class Animal {
	private String name;

	// �ݩ�protected�A�G�l���O�i�����s�����ݩ�
	protected int age;
	// �غc��k

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
		System.out.println(name + " �Y�F��");
	}

	public void sleep() {
		System.out.println(name + " �Y����");
	}

}
