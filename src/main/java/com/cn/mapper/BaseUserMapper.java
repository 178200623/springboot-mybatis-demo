package com.cn.mapper;

import com.cn.model.BaseUser;

public interface BaseUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    String selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}