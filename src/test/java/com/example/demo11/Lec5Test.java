package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec5Test {
	@Test
	public void countLetters(String input) {
		// �p���ܼ�
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;

		for (char letter : input.toCharArray()) {
			switch (letter) {
			case 'A':
				countA++;
				break;
			case 'B':
				countB++;
				break;
			case 'C':
				countC++;
				break;
			case 'D':
				countD++;

			}
		}

		System.out.println(countA + "��A  " + countB + "��B  " + countC + "��C  " + countD + "��D");
	}

	@Test
	public void testCountLetters() {

		countLetters("AABCBDCDACBDA");
	}

	public static void main(String[] args) {
		Lec5Test counter = new Lec5Test();
		counter.countLetters("AABCBDCDACBDA");
	}
}

//	    @Test
//	    public void ttsst(int asd, int qwe) {
//	        if (asd > 10) {
//	            System.out.println((asd + qwe)/2); // �� asd > 10 �ɦL�X asd + qwe ���M
//	        } 
//	        else { System.out.println("asd �����j�� 10");}
//	        
//	    }
//
//	    // ���դ�k�өI�s ttsst
//	    @Test
//	    public void testMethod() {
//	        ttsst(15, 5); // �I�s ttsst�A�o�� asd �O 15�Aqwe �O 5
//	        ttsst(5, 3);  // �I�s ttsst�A�o�� asd �O 5�Aqwe �O 3
//	    }
//	}
//

//public void mathTest() {
//		int a =Math.max(99, 2);
//		System.out.println(a);
//		int b =Math.min(99, 2);
//		System.out.println(b);
//		int c =Math.max(1, Math.max(99, 2));
//		//�p�ݤ���W�L��ӥH�W�A�h�ݦh������A�@���u����
//		System.out.println(c);
//		int d =Math.abs(-1);
//		System.out.println(d);
//		int e1 =(int)Math.round(3.5);
//		int e2 =(int)Math.round(3.4);
//		System.out.println(e1);
//		System.out.println(e2);
//		int f1 =(int)Math.rint(3.5);
//		int f2 =(int)Math.rint(3.4);
//		System.out.println(f1);
//		System.out.println(f2);
//		int g1 =(int)Math.ceil(2.5);
//		int g2 =(int)Math.floor(2.5);
//		System.out.println(g1);
//		System.out.println(g2);
//		int h1=(int)Math.sqrt(4);
//		int h2=(int)Math.cbrt(17);
//		System.out.println(h1);
//		System.out.println(h2);
//}
//	@Test
//	public void stringTest() {
//		String str1="123456";
//		
//		
//	}
//	
//	
//	
//	
