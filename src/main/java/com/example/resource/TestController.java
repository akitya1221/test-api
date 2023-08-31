package com.example.resource;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resource.dto.PayloadDto;
import com.example.resource.dto.RequestDto;
import com.example.resource.dto.ResponseDto;

@RestController
@CrossOrigin
@RequestMapping(value = "TestApi")
public class TestController {
	
	// リクエストデータマッピング用
	ModelMapper modelMapper = new ModelMapper();
	
	// Get用
	@GetMapping("/HelloApi")
	public String hello() {
		String return_message = "こんにちは!";
		TestMessage testMessage = new TestMessage();
		testMessage.setMessage(return_message);
		
		// 返却値
		return testMessage.getMesssage();
	}
	
	// Post用
	@PostMapping
	// リクエストDTOを受け取る
	public ResponseDto post(@RequestBody RequestDto req) {
		// 起動確認
		System.out.println("起動開始");
				
		// リクエストデータをDTOクラスにマッピングする
		PayloadDto data = modelMapper.map(req.getPayload(), PayloadDto.class);
		// リクエストデータの確認
		System.out.println(data);
		
		// レスポンスDTOを返却する
		ResponseDto res = new ResponseDto();
		return res;
	}
}
