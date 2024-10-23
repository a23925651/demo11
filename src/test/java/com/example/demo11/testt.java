package com.example.demo11;

import org.junit.jupiter.api.Test;

public class testt {

	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc");

		strBuf.append("sss");

	}

	@Test
	public void stringReverseTest() {
		String str = "abcde";
		String[] strArray = str.split("");

		String newStr = "";
		for (int i = strArray.length - 1; i >= 0; i--) {
			String item=strArray[i];
			newStr=newStr+item;
		}
		
		StringBuffer strBuf=new StringBuffer(str);
		strBuf=strBuf.reverse();

	}
	
	@Test
	public void tttTest() {
		int a=5;
		if(a>=18) {
			System.out.println("年齡"+a);
	System.out.println("已成年");
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}