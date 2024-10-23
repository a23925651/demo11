package com.example.demo11;

import org.junit.jupiter.api.Test;

public class TempConverter {

	@Test
	public void testConversions() {
		int celsius = 25; // 安砞尼ん放 25
		int fahrenheit = cToF(celsius); // ㊣尼ん锣地んよ猭
		System.out.println("地ん放: " + fahrenheit); // 地ん放

		int c = fToC(fahrenheit); // ㊣地ん锣尼んよ猭
		System.out.println("尼ん放: " + c); // 尼ん放
	}

	// 尼ん锣地ん
	public int cToF(int c) {
		return c * 9 / 5 + 32; // ㄏノそΑ璸衡地ん放
	}

	// 地ん锣尼ん
	public int fToC(int f) {
		return (f - 32) * 5 / 9; // ㄏノそΑ璸衡尼ん放
	}
}