package com.xchaset.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xchaset.dto.AreaPO;
import com.xchaset.dto.CityPO;
import com.xchaset.dto.ProvincePO;
import com.xchaset.mapper.AreaMapper;
import com.xchaset.mapper.CityMapper;
import com.xchaset.mapper.ProvinceMapper;
import com.xchaset.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService{
	
	@Autowired
	private ProvinceMapper provinceMapper;
	
	@Autowired
	private CityMapper cityMapper;
	
	@Autowired
	private AreaMapper areaMapper;

	@Override
	public List<ProvincePO> queryProvince() {
		Long startTime = System.currentTimeMillis();
		List<ProvincePO> proList = provinceMapper.queryAllPro();
		for (ProvincePO provincePO : proList) {
			List<CityPO>  cityPOList = cityMapper.queryByProCode(provincePO.getCode());
				for (CityPO cityPO : cityPOList) {
					List<AreaPO> areaList = areaMapper.queryByCityCode(cityPO.getCode());
					cityPO.setAreaList(areaList);
				}
			provincePO.setCityList(cityPOList);
			}
		System.out.println(System.currentTimeMillis()-startTime);
		return proList;
		}
	}

