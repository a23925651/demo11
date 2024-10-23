package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec5Test {
	@Test
	public void countLetters(String input) {
		// 計數變數
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

		System.out.println(countA + "個A  " + countB + "個B  " + countC + "個C  " + countD + "個D");
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
//	            System.out.println((asd + qwe)/2); // 當 asd > 10 時印出 asd + qwe 的和
//	        } 
//	        else { System.out.println("asd 必須大於 10");}
//	        
//	    }
//
//	    // 測試方法來呼叫 ttsst
//	    @Test
//	    public void testMethod() {
//	        ttsst(15, 5); // 呼叫 ttsst，這裡 asd 是 15，qwe 是 5
//	        ttsst(5, 3);  // 呼叫 ttsst，這裡 asd 是 5，qwe 是 3
//	    }
//	}
//

//public void mathTest() {
//		int a =Math.max(99, 2);
//		System.out.println(a);
//		int b =Math.min(99, 2);
//		System.out.println(b);
//		int c =Math.max(1, Math.max(99, 2));
//		//如需比較超過兩個以上，則需多次比較，一次只能兩個
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
