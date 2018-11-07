package com.xchaset.service;

import com.xchaset.dto.CityPO;

public interface CityService {

	CityPO queryCity(String provinceCode);
}
