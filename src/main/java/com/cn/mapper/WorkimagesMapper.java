package com.cn.mapper;

import com.cn.model.Workimages;

public interface WorkimagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workimages record);

    int insertSelective(Workimages record);

    Workimages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workimages record);

    int updateByPrimaryKey(Workimages record);
}