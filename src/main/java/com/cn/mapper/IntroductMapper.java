package com.cn.mapper;

import com.cn.model.Introduct;

public interface IntroductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Introduct record);

    int insertSelective(Introduct record);

    Introduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Introduct record);

    int updateByPrimaryKey(Introduct record);

    Introduct selectContentById(int id);
}