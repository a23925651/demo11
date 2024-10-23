package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class GuessNumberGame {
	@Test
	public void main() {

		// 創建 Scanner 物件，用於接收使用者輸入
		Scanner scanner = new Scanner(System.in);

		// 產生 2 到 98 之間的隨機數字
		Random random = new Random();
		int randomNumber = random.nextInt(97) + 2;

		// 設定初始的猜測範圍
		int min = 1;
		int max = 99;

		// 提示訊息，只顯示一次
		System.out.println("猜一個 1 到 99 之間的數字：");

		// 開始猜數字的迴圈
		while (true) {
			// 提示當前的猜測範圍，並等待使用者輸入
			System.out.printf("請在 %d ~ %d 範圍內猜一個數字: ", min, max);
			int guess = scanner.nextInt(); // 等待使用者輸入

			// 驗證輸入是否在範圍內
			if (guess <= 1 || guess >= 99) {
				System.out.println("輸入錯誤，請輸入一個在 1 到 99 之間的數字。");
				continue; // 回到迴圈開頭，讓使用者重新輸入
			}

			// 如果猜測數字比隨機數字小，更新範圍
			if (guess < randomNumber) {
				min = guess;
				System.out.printf("請在 %d ~ %d 範圍內猜個數字。\n", min, max);
			}
			// 如果猜測數字比隨機數字大，更新範圍
			else if (guess > randomNumber) {
				max = guess;
				System.out.printf("請在 %d ~ %d 範圍內猜個數字。\n", min, max);
			}
			// 猜中了！
			else {
				System.out.println("猜中了！");
				break; // 跳出迴圈，遊戲結束
			}
		}

		// 關閉 Scanner 以釋放資源
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
//		} // 每次的答案會是原本傳進來的參數+以(參數-1)來呼叫此方法的結果
//			// 城市內斥己呼叫自己，就稱為遞迴
//		int sum = x + this.recurrence(x - 1);
//		return sum;
//		// return x +this.recurrence(x-1); 匿名變數寫法(省略sum)
//	}
//
//	public guessNumber() {
//	
//	
//	}			

//	public void ifTest() {
//		String weather = "晴天";
//
//		// if
//		if (weather == "下雨") {
//			System.out.println("帶雨傘");
//		}
//		System.out.println("不用帶雨傘");
//		// 因為沒滿足()內的條件，故直接執行下一行的內容
//
//		// if...else
//		if (weather == "下雨") {
//			System.out.println("帶雨傘");
//		} else {
//			System.out.println("不用帶傘");
//		}
//
//		// if...else if...else
//		if (weather == "下雨") {
//			System.out.println("帶雨傘");
//		}
//
//		else if (weather == "大太陽") {// 否則，即不符合前面if內的條件
//			System.out.println("戴墨鏡");
//		} else {
//			System.out.println("不用做任何事");
//		}
//
//	}

//	public void ticket(int age) {
//		int ticketprice = 100;
//		if (age <= 6 || age >= 80) {
//			System.out.println("票價:20");
//		} else if ((age >= 7 && age <= 12 )||( age >= 60 && age <= 79)) {
//			System.out.println("票價:50");
//		} else
//			System.out.println("票價:100");
//	}
//}

//	public void testTicket() {
//		ticket(5); // 測試年齡 5
//		ticket(10); // 測試年齡 10
//		ticket(70); // 測試年齡 70
//		ticket(90); // 測試年齡 90
//	}
//
//	public int ticket(int age) {
//		if (age <= 6 || age >= 80) {
//			System.out.println("票價:20");
//		} else if (age <= 12 || age >= 60) {
//			System.out.println("票價:50");
//		} else {
//			System.out.println("票價:100");
//		}
//		return age;

//	        if(age <= 6 || age >= 80) {
//	            System.out.println("票價:20");
//	            return 20;
//	        }
//	        if(age >= 7 && age <= 12 || age >= 60 && age <= 79) {
//	        	c
//	        	return 50;
//	        }
//	        System.out.println("票價:100");
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
//		if (grade <= 100 && grade >= 0) {// return也有中斷的效果，所以想回傳值時只用它就行
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