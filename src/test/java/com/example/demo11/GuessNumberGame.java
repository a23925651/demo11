package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class GuessNumberGame {
	@Test
	public void main() {

		// �Ы� Scanner ����A�Ω󱵦��ϥΪ̿�J
		Scanner scanner = new Scanner(System.in);

		// ���� 2 �� 98 �������H���Ʀr
		Random random = new Random();
		int randomNumber = random.nextInt(97) + 2;

		// �]�w��l���q���d��
		int min = 1;
		int max = 99;

		// ���ܰT���A�u��ܤ@��
		System.out.println("�q�@�� 1 �� 99 �������Ʀr�G");

		// �}�l�q�Ʀr���j��
		while (true) {
			// ���ܷ�e���q���d��A�õ��ݨϥΪ̿�J
			System.out.printf("�Цb %d ~ %d �d�򤺲q�@�ӼƦr: ", min, max);
			int guess = scanner.nextInt(); // ���ݨϥΪ̿�J

			// ���ҿ�J�O�_�b�d��
			if (guess <= 1 || guess >= 99) {
				System.out.println("��J���~�A�п�J�@�Ӧb 1 �� 99 �������Ʀr�C");
				continue; // �^��j��}�Y�A���ϥΪ̭��s��J
			}

			// �p�G�q���Ʀr���H���Ʀr�p�A��s�d��
			if (guess < randomNumber) {
				min = guess;
				System.out.printf("�Цb %d ~ %d �d�򤺲q�ӼƦr�C\n", min, max);
			}
			// �p�G�q���Ʀr���H���Ʀr�j�A��s�d��
			else if (guess > randomNumber) {
				max = guess;
				System.out.printf("�Цb %d ~ %d �d�򤺲q�ӼƦr�C\n", min, max);
			}
			// �q���F�I
			else {
				System.out.println("�q���F�I");
				break; // ���X�j��A�C������
			}
		}

		// ���� Scanner �H����귽
		scanner.close();
	}
}
//	public void recurrenceTest() {
//		System.out.println(this.recurrenceTest(100));
//	}
//
//	public int recurrence(int x) {
//		if (x == 1) {
//			return 1;
//		} // �C�������׷|�O�쥻�Ƕi�Ӫ��Ѽ�+�H(�Ѽ�-1)�өI�s����k�����G
//			// ���������v�I�s�ۤv�A�N�٬����j
//		int sum = x + this.recurrence(x - 1);
//		return sum;
//		// return x +this.recurrence(x-1); �ΦW�ܼƼg�k(�ٲ�sum)
//	}
//
//	public guessNumber() {
//	
//	
//	}			

//	public void ifTest() {
//		String weather = "����";
//
//		// if
//		if (weather == "�U�B") {
//			System.out.println("�a�B��");
//		}
//		System.out.println("���αa�B��");
//		// �]���S����()��������A�G��������U�@�檺���e
//
//		// if...else
//		if (weather == "�U�B") {
//			System.out.println("�a�B��");
//		} else {
//			System.out.println("���αa��");
//		}
//
//		// if...else if...else
//		if (weather == "�U�B") {
//			System.out.println("�a�B��");
//		}
//
//		else if (weather == "�j�Ӷ�") {// �_�h�A�Y���ŦX�e��if��������
//			System.out.println("������");
//		} else {
//			System.out.println("���ΰ������");
//		}
//
//	}

//	public void ticket(int age) {
//		int ticketprice = 100;
//		if (age <= 6 || age >= 80) {
//			System.out.println("����:20");
//		} else if ((age >= 7 && age <= 12 )||( age >= 60 && age <= 79)) {
//			System.out.println("����:50");
//		} else
//			System.out.println("����:100");
//	}
//}

//	public void testTicket() {
//		ticket(5); // ���զ~�� 5
//		ticket(10); // ���զ~�� 10
//		ticket(70); // ���զ~�� 70
//		ticket(90); // ���զ~�� 90
//	}
//
//	public int ticket(int age) {
//		if (age <= 6 || age >= 80) {
//			System.out.println("����:20");
//		} else if (age <= 12 || age >= 60) {
//			System.out.println("����:50");
//		} else {
//			System.out.println("����:100");
//		}
//		return age;

//	        if(age <= 6 || age >= 80) {
//	            System.out.println("����:20");
//	            return 20;
//	        }
//	        if(age >= 7 && age <= 12 || age >= 60 && age <= 79) {
//	        	c
//	        	return 50;
//	        }
//	        System.out.println("����:100");
//	        return 100;
//	    }
//	@Test
//	public void studentgrade() {
//		rank(100);
//		rank(70);
//		rank(1000);
//		rank(-3);
//	}
//
//	public void rank(int grade) {
//
//		if (grade <= 100 && grade >= 0) {// return�]�����_���ĪG�A�ҥH�Q�^�ǭȮɥu�Υ��N��
//			switch (grade / 10) {
//			case 10:
//			case 9:
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B");
//				break;
//			case 7:
//				System.out.println("C");
//				break;
//			case 6:
//				System.out.println("D");
//				break;
//			default:
//				System.out.println("F");
//			}
//
//		} else {
//			System.out.println("error");
//		}
//	}
//
//}