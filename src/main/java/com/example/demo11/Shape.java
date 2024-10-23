package com.example.demo11;

//抽象類別不能new建立實例
public abstract class Shape {
	
	//定義一般方法
	//一般方法可以被定義在抽象類別中
	public void draw() {
		
	}
	
	//抽象方法不能有實作內容(不能有大括號)，
	//分號結尾，
	//抽象方法只能被定義在抽象類別中
	public abstract void draw1();

}
