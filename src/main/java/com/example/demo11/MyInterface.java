package com.example.demo11;

//������������H����A�Gabstract�i�ٲ�
//��H����O��H����L�knew(�ͦ��@�ӹ��)
public interface MyInterface {

	// �w�q�b���������ݩʡA�v���u��Opublic�ιw�](���g)
	// �����n����l��
	int NUM = 10;
	// ���㪺�g�k(�w�]�O�`�ƪ��榡,�]���R�W���j�g)
	public static final int NUMBER = 10;

	// �w�q�����O��H��k
	public void fly();

	void flying();
	
	//�w�]��k�A�b��L�a��n�ϥήɡA���j��n���s�w�q

	public default void flyingg(String name) {
		System.out.println(name + "flying");
	}
	
	//��������static��k�@�w�n����@���e�A�_�h�N�S����@�ΤF
	public static void flyingg2(String name) {
		System.out.println(name + "flying");
	}

}
