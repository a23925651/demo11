package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class RegexTest {
	@Test

	public void idenumber() {

		String number2 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		Scanner scan = new Scanner(System.in);
		System.out.print("�п�J 10 �X�������Ҧr��: ");
		String input = scan.next();
		if (input.matches(number2)) {
			System.out.println("�ŦX�榡");
		} else {
			System.out.println("���ŦX�榡");
		}
	}
}

//   @Test
//    public void phoneNumber() {
//        
//        String phonenumber = "\\d{2}-\\d{7,8}|\\(\\d{2}\\)-\\d{7,8}";
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("�п�J���ܸ��X (�榡��: �G�X-�C��K�X �� (�G�X)-�C��K�X:");
//        String input = scan.next();
//
//        
//        if (input.matches(phonenumber)) {
//            System.out.println(input + " �ŦX���ܸ��X�榡!!");
//        } else {
//            System.out.println(input + " ���ŦX���ܸ��X�榡!!");
//        }
//    }
//
//   public void phoneNumber2() {
//       
//       String phonenumber = "0\\d{1,3}-\\d{7,8}";
//
//       Scanner scan = new Scanner(System.in);
//       System.out.println("�п�J���ܸ��X (�榡��: 0�}�Y�X�p�G��|�X-�C��K�X");
//       String input = scan.next();
//
//       
//       if (input.matches(phonenumber)) {
//           System.out.println(input + " �ŦX���ܸ��X�榡!!");
//       } else {
//           System.out.println(input + " ���ŦX���ܸ��X�榡!!");
//       }
//   }
//   
//   @Test
// public void phoneNumber3() {
//       
//       String phonenumber = "0[1-9]{1,3}-\\d{7,8}";
//
//       Scanner scan = new Scanner(System.in);
//       System.out.println("�п�J���ܸ��X (�榡��: 0�}�Y�X�p�G��|�X-�C��K�X");
//       String input = scan.next();
//
//       if (input.matches(phonenumber)) {
//           System.out.println(input + " �ŦX���ܸ��X�榡!!");
//       } else {
//           System.out.println(input + " ���ŦX���ܸ��X�榡!!");
//       }
//   }
//
//   
//}

//
//
//	
//	
//	
//	@Test
//	public void test() {
//		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
//		// \d ��ܼƦr0��9�����N�䤤�@��
//		// \\�N�����Ÿ� �����᭱���N�q���Ÿ��ܦ��L�N�q \\ �L�X�ӴN�ܦ���ª�\ \\\\ �L�X2 4���
//		// \�L�k��W�s�b
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�п�J������X: �榡��:");
//		String input = scan.next();
//		boolean check = input.matches(pattern);
//		if (check == true) {
//			System.out.println(input + "�ŦX������X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX������X�榡!!");
//		}
//
//		if (input.matches(pattern)) {
//			System.out.println(input + "�ŦX������X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX������X�榡!!");
//		}
//		// �N�������X���榡
//		System.out.println(pattern);
//
//	}
//	// �W����input.matches(pattern)�����G��check���^��
//	// ���b����{���X�� check �u�Ψ�@��
//	// �ҥH��ΰΦW�覡��g
//
//	public void test1() {
//		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
//		// \d ��ܼƦr0��9�����N�䤤�@��
//		// \�N�����Ÿ� �����᭱���N�q���Ÿ��ܦ��L�N�q \\ �L�X�ӴN�ܦ���ª�\ \\\\ �L�X2 4���
//		// \�L�k��W�s�b
//		// String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		// �ϥΤj�A��{}�B�zpattern�����ƥX�{���r��
//		// String pattern = "\\d{4}-\\d{3}-\\d{3}";
//		// �W�@��-\\d{3}���ƥX�{�⦸
//		String pattern = "\\d{4}(-\\d{3}){2}";
//		// �o��۷��H()�]���Ƴ���
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�п�J������X: �榡��:");
//		String input = scan.next();
//
//		if (input.matches(pattern)) {
//			System.out.println(input + "�ŦX������X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX������X�榡!!");
//		}
//		// �N�������X���榡
//		System.out.println(pattern);
//	}
//
//	
//	
//	@Test
//	public void test2() {
//		// ���ܮ榡:�Ʀr2�X-�Ʀr7�X
//		String pattern1 = "\\d{2}-\\d{7}";
//		// ���ܮ榡:(�Ʀr2�X)-�Ʀr7�X
//		String pattern2 = "\\(d{2}\\)-\\d{7}";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�п�J���ܸ��X: �榡��:�Ʀr��X-�Ʀr�C�X��(�Ʀr��X)-�Ʀr�C�X");
//		String input = scan.next();
//		if (input.matches(pattern2)) {
//			System.out.println(input + "�ŦX���ܸ��X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX���ܸ��X�榡!!");
//		}
//		// ================
//		// �X��pattern1�Mpattern2
//		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
//		if (input.matches(pattern3)) {
//			System.out.println(input + "�ŦX���ܸ��X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX���ܸ��X�榡!!");
//		}
//		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
//		if (input.matches(pattern4)) {
//			System.out.println(input + "�ŦX���ܸ��X�榡!!");
//		} else {
//			System.out.println(input + "���ŦX���ܸ��X�榡!!");
//		}
//	}
//
//	@Test
//	public void test3() {
//		// ���ܮ榡:�Ʀr2�X-�Ʀr7��8
//		String pattern = "\\d{2}-\\d{7}|\\d{8}";
//
//		// \\d{7,8}��ܦܤ֥X�{7���ܦh�X�{8��
//		String pattern1 = "\\d{2}-\\d{7,8}";
//	}
