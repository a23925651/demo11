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
	  
	  System.out.print("�п�J�|���: ");
	  Scanner scanner = new Scanner(System.in);
      String guess =Scanner.nextLine;
      if (!isValidGuess(guess)) {
          System.out.println("�нT�O��J�|�Ӥ����ƪ��Ʀr�C");
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

	
//�H���ͦ��Ʀr�A�����ͦ����Ʀr�A�`��{�ˬd���a��J4�Ӭ۲��Ʀr�A�P�H���ͦ����Ʀr����P�_�P�_�A�Y�q�����Ʀr��m������Ʀr���T���?��B
//	||�Ʀr�P��m�����k�X�h�L�X?A�A�q����פ�`��}
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
//        // �Ыؤ@�ӥ]�t "0" �� "9" ���r��C��
//        List<String> number = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
//
//        // ���ö��ǡA�ÿ�ܫe�|�ӼƦr�ӥͦ����G
//        Collections.shuffle(number);
//
//        // �ϥ� Lambda ��F���ӫ����e�|�ӼƦr�����r��
//        String result = number.stream()
//                              .limit(4)  // ��ܫe�|�ӼƦr
//                              .collect(Collectors.joining());  // �N���̫������r��
//
//        return result;  // �^���H���ͦ����|��Ʀr
//    }
//
//    public static void main(String[] args) {
//        RandomNumberGenerator generator = new RandomNumberGenerator();
//        String randomNumber = generator.result();
//
//        // �L�X�H���ͦ����|��Ʀr
//        System.out.println("�H�����ͪ��|��Ʀr: " + randomNumber);
//    }
//}

//�ŧi
//		List<String>list1=Arrays.asList("1","2");
//		List<Integer>list2=List.of(99,100);
//		List<Character>list3=new ArrayList<>();
//				//������Onew ArrayList?
//		List<Character>list5=new List<>();
//				//�᭱�����A���i��Τ����ƫ��A,�]���e�ᥲ���@�P,�G�i�ٲ�
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
//        return vv; // �^�ǭp�⵲�G vv
//    }
//
//    // 2. �ϥ� JUnit �Ӵ��� wqq ��k�����G
//    @Test
//    public void testWqq() {
//        // �I�s sstest ��k�A�ǤJ�Ѽ� 4 �M 7
//        int result = sstest(4, 7);
//        
//        // �_���ˬd���G�O�_����w���� 39
//        assertEquals(39, result, "�p�⵲�G���ӬO 39");
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
//	    int result = lec4Test.sstest(4, 7);  // �I�s sstest(4,7)
//	    assertEquals(39, result);  // ���檺���G���ӬO39
//	}
//
//}
//	    public void psfs() {
//	        int pss1[] = {50, 32, 44, 46, 65};
//	        
//	      
//	        System.out.println("�ұo���f����: " + Arrays.toString(pss1));
//	        
//	        // ���̰����M�̧C��
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
//	        System.out.println("���Ĥ���: " + averageScore);
//	    }}

//	public void psfs() {
//		int pss1[]= {50,32,44,46,65
//				};
//		
//		System.out.println("�ұo���f����:"+pss1);
//		int highs=;
//			int	lows=;
//				
//		System.out.println("���Ĥ���:"+);
//	}
//	}
//	
// �L�X"�ұo���f����"+���㪺���ư}�C
// �h���̰��P�̧C���A�ѤU���ƥ��������Ĥ���
// �L�X"���Ĥ���:"+���Ĥ���

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
