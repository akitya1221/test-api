package com.akitya.testapi.service;

import java.util.Random;

/* おみくじクラス */
public class TestFortuneTelling {
	
	// おみくじ結果
	private String result_fortune;
	
	/* おみくじ処理 */
	public String FortuneTelling() {
		// 0から4までの範囲で乱数を1つ生成する
		Random random = new Random();
		int num = random.nextInt(5);
	 
		// 取得した乱数の値に応じて、おみくじ結果に値を設定する
		switch (num) {
			case(0):
				result_fortune = "大吉";
			break;
			case(1):
				result_fortune = "中吉";
			break;
			case(2):
				result_fortune = "末吉";
			break;
			case(3):
				result_fortune = "吉";
			break;
			case(4):
				result_fortune = "凶";
			break;
		}
		return result_fortune;
	}
	
}
