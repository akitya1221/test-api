package com.akitya.testapi.service;

import com.akitya.testapi.resource.dto.PayloadDto;

/* サービスインタフェース */
public interface TestService {
	
	/* 初期化処理 */
	public void init(PayloadDto payload_data);
	
}
