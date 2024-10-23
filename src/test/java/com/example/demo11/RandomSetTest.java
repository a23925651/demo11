package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class RandomSetTest {

	@Test
	
	
	
	
	
	
	
	
	
}
//	    public int[] twoSum(int[] nums, int target) {
//	        // 建立一個 Map 來存放數字及其對應的索引
//	        Map<Integer, Integer> map = new HashMap<>();
//	        
//	        // 遍歷 nums 陣列
//	        for (int i = 0; i < nums.length; i++) {
//	            int complement = target - nums[i]; // 補數
//	            
//	            // 如果補數存在於 Map 中，返回 index 組合
//	            if (map.containsKey(complement)) {
//	                return new int[] { map.get(complement), i };
//	            }
//	            
//	            // 若未找到補數，將當前數字和索引存入 Map
//	            map.put(nums[i], i);
//	        }
//	        
//	        // 如果沒有符合的組合，返回空陣列（實際應該避免）
//	        return new int[] {};
//	    }

	    
	

	
	
//	public void mapTest2() {
//		List<String> list=new ArrayList<>();
//		System.out.println(list.isEmpty());
//		Set<String> set=new HashSet<>();
//		System.out.println(list.isEmpty());
//		Map<String,String> map=new HashMap<>();
//		System.out.println(list.isEmpty());
//		
//		//值是null的情況下會報錯，印不出任何東西。但空的list map set，還是能執行isEmpty
//	}
	








	
//	public void mapTest2() {
//		Map<Integer,String>map1=new HashMap<>();
//		Map<Integer,String[]>map2=new HashMap<>();
//		Map<Integer,List<String>>map3=new HashMap<>();
//		Map<Integer,Set<String>>map4=new HashMap<>();
//		Map<Integer,Map<String,String>>map5=new HashMap<>();
//		
//		
//	}
	













//	public void mapTest() {
//		// Map<K,V>
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "A");
//		map.put(2, "B");
//		map.put(3, "A");
//		map.put(1, "C");
//		// 使用get取K出來
//		String str = map.get(2);
//		System.out.println(str);
//		// 遍歷使用for each 將map中的KＶ值取出
//		// 將map轉成keySet，透過get item將相應的V值取出
//		for (Entry<Integer, String> item : map.entrySet()) {
//			System.out.println(item.getKey());
//			System.out.println(item.getValue());
//		}
//
//		for (Integer item : map.keySet()) {
//			System.out.println("key: " + item);
//			System.out.println("value: " + map.get(item));
//		}
//
//	}
//
//}

//	public void randomSetTest() {
//		Set<Integer> strSet = new TreeSet<>();
//		Random random = new Random();
//
//		for (; strSet.size() < 5;) {
//			int rrandom = random.nextInt(10) + 1;
//			strSet.add(rrandom);
//		}
// while迴圈
//		while(strSet.size() < 5) {
//			Random ran=new Random();
//			int number=ran.nextInt(1,11);  1.
//		    set.add(number)                2.
//		    set.add(ran.nextInt(1,11)):   1.2.簡化匿名
//		}
//      System.out.println("由小到大排序: " ((TreeSet<Integer>)set).first());
//      System.out.println("由大到小排序: " ((TreeSet<Integer>)set).last());
//                                         (轉型) 要用小括號包著
//		List<Integer> bList = new ArrayList<>(strSet);
//		Collections.reverse(bList);
//
//		System.out.println("由小到大排序: " + strSet);
//		System.out.println("由大到小排序: " + bList);
//		System.out.println("最大數字: " + Collections.max(bList));
//		System.out.println("最小數字: " + Collections.min(bList));
//	}

//	public static void randomtest() {
//        Random random = new Random();
//        Integer[] numbers = new Integer[5];  // 建立存放 5 個數字的陣列
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(11) ;  // [1, 10] 範圍
//        }
//
//        System.out.println("原始隨機數: " + Arrays.toString(numbers));
//
//        // 排序 (由大到小)
//        Arrays.sort(numbers, Collections.reverseOrder());
//
//        System.out.println("排序後: " + Arrays.toString(numbers));
//    }
//
//}

//	@Test
//	public void setTest() {
//		//HashSet 1.相同的元素只會保留一個(不允許重複元素)
//		//    2.無序(不會按照新增的順序排列)
//		Set<String> strSet=new HashSet<>();
//		strSet.add("A");
//		strSet.add("C");
//		strSet.add("A");
//		strSet.add("D");
//		strSet.add("F");
//		strSet.add("B");
//		strSet.add("E");
//		strSet.add("B");
//		
//		for(String item:strSet);
//		{System.out.println(strSet);
//			
//		}
//	}
//	@Test
//	public void treesetTest() {
//		//TreeSet 
//		//1.相同的元素只會保留一個(不允許重複元素)
//		//2.由小到大排序(按內部碼的大小)
//		Set<String> strSet=new TreeSet<>();
//		strSet.add("A");
//		strSet.add("C");
//		strSet.add("A");
//		strSet.add("D");
//		strSet.add("F");
//		strSet.add("B");
//		strSet.add("E");
//		strSet.add("B");
//		
//		for(String item:strSet);
//		{System.out.println(strSet);
//			
//		}
//	}

//	@Test
//	public void linkedHashsetTest() {
//		//LinkedHashSet 
//		//1.相同的元素只會保留一個(不允許重複元素)
//		//2.有序(會按照新增的順序排列)
//		Set<String> strSet=new LinkedHashSet<>();
//		strSet.add("A");
//		strSet.add("C");
//		strSet.add("A");
//		strSet.add("D");
//		strSet.add("F");
//		strSet.add("B");
//		strSet.add("E");
//		strSet.add("B");
//		
//		for(String item:strSet);
//		{System.out.println(strSet);
//			
//		}
//	}

//	public void listtest() {
//		Bank bank=new Bank();
//		List<Bank> list=new ArrayList<>();
//		List<Integer> intlist=new ArrayList<>();
//		
//		intlist.add(8);
//		intlist.add(7);
//		intlist.add(7);
//		intlist.add(8);
//		
//	}
