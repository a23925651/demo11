package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class RegexTest {
	@Test

	public void idenumber() {

		String number2 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入 10 碼的身份證字號: ");
		String input = scan.next();
		if (input.matches(number2)) {
			System.out.println("符合格式");
		} else {
			System.out.println("不符合格式");
		}
	}
}

//   @Test
//    public void phoneNumber() {
//        
//        String phonenumber = "\\d{2}-\\d{7,8}|\\(\\d{2}\\)-\\d{7,8}";
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("請輸入市話號碼 (格式為: 二碼-七到八碼 或 (二碼)-七到八碼:");
//        String input = scan.next();
//
//        
//        if (input.matches(phonenumber)) {
//            System.out.println(input + " 符合市話號碼格式!!");
//        } else {
//            System.out.println(input + " 不符合市話號碼格式!!");
//        }
//    }
//
//   public void phoneNumber2() {
//       
//       String phonenumber = "0\\d{1,3}-\\d{7,8}";
//
//       Scanner scan = new Scanner(System.in);
//       System.out.println("請輸入市話號碼 (格式為: 0開頭合計二到四碼-七到八碼");
//       String input = scan.next();
//
//       
//       if (input.matches(phonenumber)) {
//           System.out.println(input + " 符合市話號碼格式!!");
//       } else {
//           System.out.println(input + " 不符合市話號碼格式!!");
//       }
//   }
//   
//   @Test
// public void phoneNumber3() {
//       
//       String phonenumber = "0[1-9]{1,3}-\\d{7,8}";
//
//       Scanner scan = new Scanner(System.in);
//       System.out.println("請輸入市話號碼 (格式為: 0開頭合計二到四碼-七到八碼");
//       String input = scan.next();
//
//       if (input.matches(phonenumber)) {
//           System.out.println(input + " 符合市話號碼格式!!");
//       } else {
//           System.out.println(input + " 不符合市話號碼格式!!");
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
//		// 比對手機號碼格式:數字4碼-數字3碼-數字3碼
//		// \d 表示數字0到9的任意其中一種
//		// \\代表跳脫符號 能讓後面有意義的符號變成無意義 \\ 印出來就變成單純的\ \\\\ 印出2 4兩個
//		// \無法單獨存在
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入手機號碼: 格式為:");
//		String input = scan.next();
//		boolean check = input.matches(pattern);
//		if (check == true) {
//			System.out.println(input + "符合手機號碼格式!!");
//		} else {
//			System.out.println(input + "不符合手機號碼格式!!");
//		}
//
//		if (input.matches(pattern)) {
//			System.out.println(input + "符合手機號碼格式!!");
//		} else {
//			System.out.println(input + "不符合手機號碼格式!!");
//		}
//		// 代表手機號碼的格式
//		System.out.println(pattern);
//
//	}
//	// 上面的input.matches(pattern)的結果用check接回來
//	// 但在後續程式碼中 check 只用到一次
//	// 所以能用匿名方式改寫
//
//	public void test1() {
//		// 比對手機號碼格式:數字4碼-數字3碼-數字3碼
//		// \d 表示數字0到9的任意其中一種
//		// \代表跳脫符號 能讓後面有意義的符號變成無意義 \\ 印出來就變成單純的\ \\\\ 印出2 4兩個
//		// \無法單獨存在
//		// String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		// 使用大括號{}處理pattern中重複出現的字串
//		// String pattern = "\\d{4}-\\d{3}-\\d{3}";
//		// 上一行-\\d{3}重複出現兩次
//		String pattern = "\\d{4}(-\\d{3}){2}";
//		// 這邊相當於以()包住重複部分
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入手機號碼: 格式為:");
//		String input = scan.next();
//
//		if (input.matches(pattern)) {
//			System.out.println(input + "符合手機號碼格式!!");
//		} else {
//			System.out.println(input + "不符合手機號碼格式!!");
//		}
//		// 代表手機號碼的格式
//		System.out.println(pattern);
//	}
//
//	
//	
//	@Test
//	public void test2() {
//		// 市話格式:數字2碼-數字7碼
//		String pattern1 = "\\d{2}-\\d{7}";
//		// 市話格式:(數字2碼)-數字7碼
//		String pattern2 = "\\(d{2}\\)-\\d{7}";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入市話號碼: 格式為:數字兩碼-數字七碼或(數字兩碼)-數字七碼");
//		String input = scan.next();
//		if (input.matches(pattern2)) {
//			System.out.println(input + "符合市話號碼格式!!");
//		} else {
//			System.out.println(input + "不符合市話號碼格式!!");
//		}
//		// ================
//		// 合併pattern1和pattern2
//		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
//		if (input.matches(pattern3)) {
//			System.out.println(input + "符合市話號碼格式!!");
//		} else {
//			System.out.println(input + "不符合市話號碼格式!!");
//		}
//		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
//		if (input.matches(pattern4)) {
//			System.out.println(input + "符合市話號碼格式!!");
//		} else {
//			System.out.println(input + "不符合市話號碼格式!!");
//		}
//	}
//
//	@Test
//	public void test3() {
//		// 市話格式:數字2碼-數字7或8
//		String pattern = "\\d{2}-\\d{7}|\\d{8}";
//
//		// \\d{7,8}表示至少出現7次至多出現8次
//		String pattern1 = "\\d{2}-\\d{7,8}";
//	}
