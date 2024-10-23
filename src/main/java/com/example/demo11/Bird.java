package com.example.demo11;

public class Bird extends Animal {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void flying() {
		System.out.println(super.getName());

		System.out.println("今年" + age + "歲" + getName()); // 可省略super
	}

	// 註解@Override可刪(當前JAVA版本)。用於重新定義父類別中已有的方法，用於不同實作內容時
	// 背心定義的方法權限不可比父類小，除了實作內容外，其他全都和原方法一樣
	@Override
	public void eat() {
		System.out.println(getName()+"吃不停");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"睡很多");
	};

}