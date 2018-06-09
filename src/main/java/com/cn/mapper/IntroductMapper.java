package com.cn.mapper;

import com.cn.model.Introduct;

import java.util.Map;

public interface IntroductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Introduct record);

    int insertSelective(Introduct record);

    Introduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Introduct record);

    int updateByPrimaryKey(Introduct record);

    Map<String,Object> selectContentById();
}