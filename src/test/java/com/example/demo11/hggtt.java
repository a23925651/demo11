package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;


public class hggtt {

	// 不在這裡直接呼叫 sum 方法
	//public int finish;

	// 這是一個測試方法，用來執行測試
//	@Test
//	public void testSum() {
//		// 呼叫 sum 方法並賦值給 finish
//		finish = this.sum(100);
//		// 打印出結果
//		System.out.println(finish);
//	}
//
//	// sum 方法用來計算從 0 到 end 的所有數值的總和
//	public int sum(int end) {
//		int sum = 0;
//		for (int i = 0; i <= end; i++) {
//			sum += i; // 累加數值
//		}
//		return sum; // 返回總和
//	}
//	
//	public int C(int end) {
//		int sum = 0;
//		int i = 0;
//		while(i <= end) {
//			sum += i;
//			i++;
//		}
//		return sum;
//	}
	
//	public void calTest() {
//		int end=100;calcul(end);
//	}
//	
//	    public void calcul(int end) {
//	        int sum = 0; 
//	        int i = 1; 
//
//	        
//	        do {
//	            sum += i;
//	            i++; 
//	        } while (i <= end); 
//
//	        
//	        System.out.println(sum);
//	    }
//
//	 
//	}
//
//public void inforloop() {
//	int i=-1;
//	for(;;) {i++;if(i==1)}
//	if(i==5) {continure}
	
//	public void nestedLoopBreakTest() {
//		a: for(int i =0;i<10;i+=2) {
//		System.out.println(i);	
//			for(int j =1;j<10;j+=2) { //幫迴圈加上標籤名稱，只需在迴圈加上[標籤名稱:]
//				System.out.println(j);
//				//break;
//				break a; //若要對外層迴圈作用，須在外層迴圈加上標籤，再註明此標籤名稱
//			}
//			System.out.println("內層已結束");
//		}
//		System.out.println("外層以結束");
//	}
//	
	
    	    	
		//判斷能否被2整除
//		if(foot%2==1) {
//			System.out.println("此題無解");
//			return;
//		}
//		//假設兔子為0隻
//		int rabbit=0;
//		//以下方法重複執行，故用while包起來
//		while(true) {
//			
//			//利用兔數，反推雞數
//		int chicken=head-rabbit;
//		
//		if(rabbit*4+chicken*2==foot) {
//			System.out.println("雞:兔\n%d:%d\n,chicken,rabbit");
//			//因為唯一解，所以離開迴圈
//			//break ;//此時
//			return; //因為離開迴圈後沒有要做其他事
//			}
//		System.out.println("執行一輪");
//		//下一輪
//		rabbit++;
//		//如果兔>頭，無解
//		if (rabbit>head) {
//		System.out.println("無解");
//		break;// 因為離開迴圈後沒有其他事情，所以直接離開迴圈
//}
//		}
//}		
//}
		@Test
//	    public void cttl() {
//	        int head = 35;
//	        int foot = 130;
//			
//			// 判斷腳數是否能被2整除，若不能則無解
//			if (foot % 2 == 1) {
//				System.out.println("此題無解");
//				return;
//			}
//			
//			// 假設兔子數量為0隻
//			int rabbit = 0;
//			
//			// 使用 while 迴圈來逐步嘗試解答
//			while (true) {
//				// 根據兔子的數量來計算雞的數量
//				int chicken = head - rabbit;
//				
//				// 判斷兔子和雞的總腳數是否等於給定的腳數
//				if (rabbit * 4 + chicken * 2 == foot) {
//					// 格式化輸出雞和兔的數量
//					System.out.printf("雞:兔 = %d:%d\n", chicken, rabbit);
//					return; // 找到解答後返回
//				}
//				
//				// 增加兔子的數量，進行下一輪判斷
//				rabbit++;
//				
//				// 如果兔子的數量超過了頭的數量，則無解
//				if (rabbit > head) {
//					System.out.println("無解");
//					break; // 結束迴圈
//				}
//			}
//		}
//	}

		
		
		
		
		
		
		
		

