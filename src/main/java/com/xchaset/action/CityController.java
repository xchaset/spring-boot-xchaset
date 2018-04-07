package com.xchaset.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xchaset.dto.BaseResponseDTO;
import com.xchaset.dto.ProvincePO;
import com.xchaset.po.Province;
import com.xchaset.service.ProvinceService;

@RestController
public class CityController {
	@Autowired
	private ProvinceService provinceService;

	@GetMapping("/getCityArea")
	public BaseResponseDTO<List<ProvincePO>> getProviceCity(){
		List<ProvincePO> list = provinceService.queryProvince();
		BaseResponseDTO<List<ProvincePO>> res = new BaseResponseDTO<>();
		res.setCode("000000");
		res.setData(list);
		res.setMsg("sucess");
		return res;
	}
}
