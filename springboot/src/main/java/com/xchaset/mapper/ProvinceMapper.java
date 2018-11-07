package com.xchaset.mapper;

import java.util.List;

import com.xchaset.dto.ProvincePO;

public interface ProvinceMapper {
    int insert(ProvincePO record);

    int insertSelective(ProvincePO record);
    
    List<ProvincePO> queryAllPro();
}