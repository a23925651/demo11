package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
//	@Test
//	public void dogTest() {
//	//new建立實例(instance)
//	Dog mydog=new Dog();
//	//設定每個實例不同的屬性
//	mydog.category="吉娃娃";
//	mydog.color="米黃色";
//	mydog.name="吉掰";
//	mydog.age=1;
//	mydog.eat("胖柴");
//	System.out.println("狗的品種:"+mydog.category);
//	

	
	
	@Test
	public void bankTest() {
		Bank2 bank=new Bank2();
		bank.setUser("AAA");
		bank.setBalance(1000);
		//存款
		bank.saving(-5000);
		bank.withdraw(100);
		bank.withdraw(3000);
	}
	
	
	
	
	
}
