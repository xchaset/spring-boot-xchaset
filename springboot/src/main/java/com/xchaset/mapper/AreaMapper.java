package com.xchaset.mapper;

import java.util.List;

import com.xchaset.dto.AreaPO;

public interface AreaMapper {
    int insert(AreaPO record);

    int insertSelective(AreaPO record);
    
    List<AreaPO> queryByCityCode(String cityCode);
}