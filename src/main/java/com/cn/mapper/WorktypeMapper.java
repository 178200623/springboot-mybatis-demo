package com.cn.mapper;

import com.cn.model.Worktype;

public interface WorktypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Worktype record);

    int insertSelective(Worktype record);

    Worktype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Worktype record);

    int updateByPrimaryKey(Worktype record);
}