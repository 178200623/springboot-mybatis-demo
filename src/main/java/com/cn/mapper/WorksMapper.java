package com.cn.mapper;

import com.cn.model.Works;

import java.util.List;
import java.util.Map;

public interface WorksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

    /**
     * 获取作品列表
     * @return
     */
    List<Map<String,Object>> selectListWorks();

    /**
     * 获取单个作品
     * @param id
     * @return
     */
    List<Map<String,Object>> selectById(Integer id);
}