package com.example.demo11;

public class Dog {
	// �ŧi�ݩ�(�S��)
	String category;

	String color;

	String name;

	int age;

	// �w�q��k(�欰)
	
	//��k�W�٤@�ˡA�ѼƭӼƤ��@�� ��k�h�i
	public void run() {
		System.out.println("running!!");
	}
	public void run(String name) {
		System.out.println("running!!");
	}

	public void running() {
		System.out.println(name + "���b�]");
	}

	public void eat(String name) {
		// �L�X �Q���`��ܷR�Y�ܦ��D�`��
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);
	}

}
