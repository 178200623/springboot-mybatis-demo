package com.cn.mapper;

import com.cn.model.Awards;

public interface AwardsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);
}