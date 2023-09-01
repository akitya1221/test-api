package com.akitya.testapi.service;

import com.akitya.testapi.resource.dto.PayloadDto;

/* サービスクラス */
public class TestServiceImpl implements TestService {

	// ペイロードデータ
	private PayloadDto payload_data;
	
	// 初期化処理
	public void init(PayloadDto payload_data) {
		// フィールドへペイロードデータを格納
		this.payload_data = payload_data;
	}
}
