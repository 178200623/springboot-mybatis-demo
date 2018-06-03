package com.cn.mapper;

import com.cn.model.Exhibition;

public interface ExhibitionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exhibition record);

    int insertSelective(Exhibition record);

    Exhibition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exhibition record);

    int updateByPrimaryKey(Exhibition record);
}