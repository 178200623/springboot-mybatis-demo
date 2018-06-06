package com.cn.mapper;

import com.cn.model.Awards;

import java.util.List;
import java.util.Map;

public interface AwardsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    List<Map<String,Object>> selectContent();
}