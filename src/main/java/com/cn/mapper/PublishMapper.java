package com.cn.mapper;

import com.cn.model.Publish;

import java.util.List;
import java.util.Map;

public interface PublishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Publish record);

    int insertSelective(Publish record);

    Publish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);

    /**
     * 获取作品中出版年份列表
     * @return
     */
    List<Map<String,Object>> selectYearList();

    /**
     * 获取某年出版列表
     * @return
     */
    List<Map<String,Object>> selectPublishByYear(String year);
}