package com.example.demo11;

//介面本身為抽象物件，故abstract可省略
//抽象物件是抽象物件無法new(生成一個實例)
public interface MyInterface {

	// 定義在介面中的屬性，權限只能是public或預設(不寫)
	// 必須要給初始值
	int NUM = 10;
	// 完整的寫法(預設是常數的格式,因此命名全大寫)
	public static final int NUMBER = 10;

	// 定義的都是抽象方法
	public void fly();

	void flying();
	
	//預設方法，在其他地方要使用時，不強制要重新定義

	public default void flyingg(String name) {
		System.out.println(name + "flying");
	}
	
	//介面中的static方法一定要有實作內容，否則就沒任何作用了
	public static void flyingg2(String name) {
		System.out.println(name + "flying");
	}

}
