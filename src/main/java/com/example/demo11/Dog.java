package com.example.demo11;

public class Dog {
	// 宣告屬性(特性)
	String category;

	String color;

	String name;

	int age;

	// 定義方法(行為)
	
	//方法名稱一樣，參數個數不一樣 方法多展
	public void run() {
		System.out.println("running!!");
	}
	public void run(String name) {
		System.out.println("running!!");
	}

	public void running() {
		System.out.println(name + "正在跑");
	}

	public void eat(String name) {
		// 印出 霸氣的總柴很愛吃變成胖總柴
		System.out.println(this.name + "很愛吃變成" + name);
	}

}
