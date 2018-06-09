package com.cn.mapper;

import com.cn.model.Exhibition;

import java.util.List;
import java.util.Map;

public interface ExhibitionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exhibition record);

    int insertSelective(Exhibition record);

    Exhibition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exhibition record);

    int updateByPrimaryKey(Exhibition record);

    /**
     * 获取展览列表
     * @return
     */
    List<Map<String,Object>> selectContent();
}