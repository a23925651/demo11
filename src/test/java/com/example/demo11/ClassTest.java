package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
//	@Test
//	public void dogTest() {
//	//new�إ߹��(instance)
//	Dog mydog=new Dog();
//	//�]�w�C�ӹ�Ҥ��P���ݩ�
//	mydog.category="�N����";
//	mydog.color="�̶���";
//	mydog.name="�N�T";
//	mydog.age=1;
//	mydog.eat("�D��");
//	System.out.println("�����~��:"+mydog.category);
//	

	
	
	@Test
	public void bankTest() {
		Bank2 bank=new Bank2();
		bank.setUser("AAA");
		bank.setBalance(1000);
		//�s��
		bank.saving(-5000);
		bank.withdraw(100);
		bank.withdraw(3000);
	}
	
	
	
	
	
}
