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
//	        // �إߤ@�� Map �Ӧs��Ʀr�Ψ����������
//	        Map<Integer, Integer> map = new HashMap<>();
//	        
//	        // �M�� nums �}�C
//	        for (int i = 0; i < nums.length; i++) {
//	            int complement = target - nums[i]; // �ɼ�
//	            
//	            // �p�G�ɼƦs�b�� Map ���A��^ index �զX
//	            if (map.containsKey(complement)) {
//	                return new int[] { map.get(complement), i };
//	            }
//	            
//	            // �Y�����ɼơA�N��e�Ʀr�M���ަs�J Map
//	            map.put(nums[i], i);
//	        }
//	        
//	        // �p�G�S���ŦX���զX�A��^�Ű}�C�]��������קK�^
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
//		//�ȬOnull�����p�U�|�����A�L���X����F��C���Ū�list map set�A�٬O�����isEmpty
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
//		// �ϥ�get��K�X��
//		String str = map.get(2);
//		System.out.println(str);
//		// �M���ϥ�for each �Nmap����K��Ȩ��X
//		// �Nmap�নkeySet�A�z�Lget item�N������V�Ȩ��X
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
// while�j��
//		while(strSet.size() < 5) {
//			Random ran=new Random();
//			int number=ran.nextInt(1,11);  1.
//		    set.add(number)                2.
//		    set.add(ran.nextInt(1,11)):   1.2.²�ưΦW
//		}
//      System.out.println("�Ѥp��j�Ƨ�: " ((TreeSet<Integer>)set).first());
//      System.out.println("�Ѥj��p�Ƨ�: " ((TreeSet<Integer>)set).last());
//                                         (�૬) �n�Τp�A���]��
//		List<Integer> bList = new ArrayList<>(strSet);
//		Collections.reverse(bList);
//
//		System.out.println("�Ѥp��j�Ƨ�: " + strSet);
//		System.out.println("�Ѥj��p�Ƨ�: " + bList);
//		System.out.println("�̤j�Ʀr: " + Collections.max(bList));
//		System.out.println("�̤p�Ʀr: " + Collections.min(bList));
//	}

//	public static void randomtest() {
//        Random random = new Random();
//        Integer[] numbers = new Integer[5];  // �إߦs�� 5 �ӼƦr���}�C
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(11) ;  // [1, 10] �d��
//        }
//
//        System.out.println("��l�H����: " + Arrays.toString(numbers));
//
//        // �Ƨ� (�Ѥj��p)
//        Arrays.sort(numbers, Collections.reverseOrder());
//
//        System.out.println("�Ƨǫ�: " + Arrays.toString(numbers));
//    }
//
//}

//	@Test
//	public void setTest() {
//		//HashSet 1.�ۦP�������u�|�O�d�@��(�����\���Ƥ���)
//		//    2.�L��(���|���ӷs�W�����ǱƦC)
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
//		//1.�ۦP�������u�|�O�d�@��(�����\���Ƥ���)
//		//2.�Ѥp��j�Ƨ�(�������X���j�p)
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
//		//1.�ۦP�������u�|�O�d�@��(�����\���Ƥ���)
//		//2.����(�|���ӷs�W�����ǱƦC)
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
