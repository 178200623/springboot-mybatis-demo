package com.cn.mapper;

import com.cn.model.Remember;

public interface RememberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Remember record);

    int insertSelective(Remember record);

    Remember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Remember record);

    int updateByPrimaryKey(Remember record);
}