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

		System.out.println("���~" + age + "��" + getName()); // �i�ٲ�super
	}

	// ����@Override�i�R(��eJAVA����)�C�Ω󭫷s�w�q�����O���w������k�A�Ω󤣦P��@���e��
	// �I�ߩw�q����k�v�����i������p�A���F��@���e�~�A��L�����M���k�@��
	@Override
	public void eat() {
		System.out.println(getName()+"�Y����");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"�Ϋܦh");
	};

}