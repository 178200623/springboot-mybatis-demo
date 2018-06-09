package com.cn.mapper;

import com.cn.model.Remember;

import java.util.List;
import java.util.Map;

public interface RememberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Remember record);

    int insertSelective(Remember record);

    Remember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Remember record);

    int updateByPrimaryKey(Remember record);

    /**
     * 获取记事年份列表
     * @return
     */
    List<Map<String,Object>> selectYearList();

    /**
     * 获取单年记事
     * @return
     */
    Map<String,Object> selectContentByYear(String year);
}