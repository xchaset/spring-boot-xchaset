package com.xchaset.mapper;

import java.util.List;

import com.xchaset.dto.CityPO;

public interface CityMapper {
    int insert(CityPO record);

    int insertSelective(CityPO record);
    
    List<CityPO> queryByProCode(String proCode);
}