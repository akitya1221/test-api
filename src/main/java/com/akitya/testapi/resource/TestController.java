package com.akitya.testapi.resource;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akitya.testapi.resource.dto.PayloadDto;
import com.akitya.testapi.resource.dto.RequestDto;
import com.akitya.testapi.resource.dto.ResponseDto;
import com.akitya.testapi.service.TestFortuneTelling;

@RestController
@CrossOrigin
@RequestMapping(value = "TestApi")
public class TestController {
	
	// リクエストデータマッピング用
	ModelMapper modelMapper = new ModelMapper();
	
	// Get用
	@GetMapping("/fortune-telling")
	/* おみくじ */
	public String fortune() {
		// おみくじ結果
		String result_fortune = null;
		TestFortuneTelling testFortuneTelling = new TestFortuneTelling();
		// おみくじメソッドを起動
		// おみくじの結果を格納
		result_fortune = testFortuneTelling.FortuneTelling();
		
		// おみくじ結果を返却
		return result_fortune;
	}
	
	// Post用
	@PostMapping
	// リクエストDTOを受け取る
	public ResponseDto post(@RequestBody RequestDto req) {
		// 起動確認
		System.out.println("起動開始");
				
		// リクエストデータをDTOクラスにマッピングする
		PayloadDto payload_data = modelMapper.map(req.getPayload(), PayloadDto.class);
		// リクエストデータの確認
		System.out.println(payload_data);
		
		// レスポンスDTOを返却する
		ResponseDto res = new ResponseDto();
		return res;
	}
}
