package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class Lec4Test {
	@Test
	public  void result() {
		List<String> number = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
		Collections.shuffle(number);
		String result = number.stream().limit(4).collect(Collectors.joining());
		
   while(true) {
	  
	  System.out.print("請輸入四位數: ");
	  Scanner scanner = new Scanner(System.in);
      String guess =Scanner.nextLine;
      if (!isValidGuess(guess)) {
          System.out.println("請確保輸入四個不重複的數字。");
          continue;
      }

	
	
	break;
}
	}

	private String Scanner.nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	}
//
//	private boolean isValidGuess(String guess) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	

	
//隨機生成數字，提取生成的數字，循環{檢查玩家輸入4個相異數字，與隨機生成的數字比較判斷判斷，若猜測的數字位置不對但數字正確顯示?個B
//	||數字與位置完全吻合則印出?A，猜中後終止循環}
//	public void result() {
//		List<String> number = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
//		Collections.shuffle(number);
//		String result = number.stream().limit(4).collect(Collectors.joining());
//
//		{
//			System.out.println(result);
//
//		}
//
//	}

}

//    public String result() {
//        // 創建一個包含 "0" 到 "9" 的字串列表
//        List<String> number = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
//
//        // 打亂順序，並選擇前四個數字來生成結果
//        Collections.shuffle(number);
//
//        // 使用 Lambda 表達式來拼接前四個數字成為字串
//        String result = number.stream()
//                              .limit(4)  // 選擇前四個數字
//                              .collect(Collectors.joining());  // 將它們拼接成字串
//
//        return result;  // 回傳隨機生成的四位數字
//    }
//
//    public static void main(String[] args) {
//        RandomNumberGenerator generator = new RandomNumberGenerator();
//        String randomNumber = generator.result();
//
//        // 印出隨機生成的四位數字
//        System.out.println("隨機產生的四位數字: " + randomNumber);
//    }
//}

//宣告
//		List<String>list1=Arrays.asList("1","2");
//		List<Integer>list2=List.of(99,100);
//		List<Character>list3=new ArrayList<>();
//				//為什麼是new ArrayList?
//		List<Character>list5=new List<>();
//				//後面的角括號可填或不填資料型態,因為前後必須一致,故可省略
//		}
//List<Double>temp=Arrays.asList(30.0,26.5,23.3,21.8,28.5,35.9);
//List<Double>wert= new ArrayList<>(temp);
//List<Double>wert1= new ArrayList<>(List.of(30.0,26.5,23.3,21.8,28.5,35.9));
//
//public double avgWeather(List<double>weatherList) {
//	double sum=0;
//	for(int i=0,i<weatherList.site,i++)
//		sum+=weatherList.get(1);
//		}
//return sum;/weatherList.size();
//}
//    for (Double item:weatherList) (
//    	System.out.println(item);)
//return 0.0;
//    }
//
//weather.forEach(item->{
//	sum+=item;
//});
//return sum/	weatherList.size();
//
//
//
//
//		
//		
//
//	}
//    public int sstest(int a, int b) {
//        int bc = a + b;
//        int er = a * b;
//        int vv = bc + er;
//        return vv; // 回傳計算結果 vv
//    }
//
//    // 2. 使用 JUnit 來測試 wqq 方法的結果
//    @Test
//    public void testWqq() {
//        // 呼叫 sstest 方法，傳入參數 4 和 7
//        int result = sstest(4, 7);
//        
//        // 斷言檢查結果是否等於預期值 39
//        assertEquals(39, result, "計算結果應該是 39");
//    }
//}

//	public void ddtest() {
//		int a=2;
//		int b=3;		
//	int asd=a+b;
//	System.out.println(asd);
//	}
//	}
//
//	@Test
//	public int sstest(int a, int b) {
//		int bc = a + b;
//		int er = a * b;
//		int vv = bc + er;
//		return vv;
//
//	}
//
//	public void wqq() {
//		int qaa = sstest(4, 7);
//		System.out.println(qaa);
//
//	}
//	public void testWqq() {
//	    Lec4Test lec4Test = new Lec4Test();
//	    int result = lec4Test.sstest(4, 7);  // 呼叫 sstest(4,7)
//	    assertEquals(39, result);  // 期望的結果應該是39
//	}
//
//}
//	    public void psfs() {
//	        int pss1[] = {50, 32, 44, 46, 65};
//	        
//	      
//	        System.out.println("所得評審分數: " + Arrays.toString(pss1));
//	        
//	        // 找到最高分和最低分
//	        int highs = Integer.MIN_VALUE;
//	        int lows = Integer.MAX_VALUE;
//	        
//	        for (int score : pss1) {
//	            if (score > highs) {
//	                highs = score;
//	            }
//	            if (score < lows) {
//	                lows = score; 
//	            }
//	        }
//	        
//	     
//	        int totalScore = 0;
//	        int count = 3;
//
//	        for (int score : pss1) {
//	            if (score != highs && score != lows) {
//	                totalScore += score;
//	                ;
//	            }
//	        }
//
//	      
//	        double averageScore = totalScore / count;
//
//	       
//	        System.out.println("有效分數: " + averageScore);
//	    }}

//	public void psfs() {
//		int pss1[]= {50,32,44,46,65
//				};
//		
//		System.out.println("所得評審分數:"+pss1);
//		int highs=;
//			int	lows=;
//				
//		System.out.println("有效分數:"+);
//	}
//	}
//	
// 印出"所得評審分數"+完整的分數陣列
// 去除最高與最低分，剩下分數平均成有效分數
// 印出"有效分數:"+有效分數

//	public void arrayTest() {
//int []arr=new int[5];
//Integer[]arr1= new Integer[4];
//int[]arr2=new int[3];
//int arr3[]= {1,2,3,4,5,6,7
//		
//};
//double[]weather= {30.0,26.5,14,18,19.2,8,4.2};}
//	
//	public double avgwe(double[]weatherData) {
//		System.out.println(weatherData.toString());
//	}
//
//}
//
//}}
