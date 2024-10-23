package com.example.demo11;

import org.junit.jupiter.api.Test;

public class TempConverter {

	@Test
	public void testConversions() {
		int celsius = 25; // ���]���ū׬� 25
		int fahrenheit = cToF(celsius); // �I�s�����ؤ󪺤�k
		System.out.println("�ؤ�ū�: " + fahrenheit); // �L�X�ؤ�ū�

		int c = fToC(fahrenheit); // �I�s�ؤ�����󪺤�k
		System.out.println("���ū�: " + c); // �L�X���ū�
	}

	// �����ؤ�
	public int cToF(int c) {
		return c * 9 / 5 + 32; // �ϥΤ����p��ؤ�ū�
	}

	// �ؤ������
	public int fToC(int f) {
		return (f - 32) * 5 / 9; // �ϥΤ����p�����ū�
	}
}