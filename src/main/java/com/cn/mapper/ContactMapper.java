package com.cn.mapper;

import com.cn.model.Contact;

import java.util.Map;

public interface ContactMapper {
    int insert(Contact record);

    int insertSelective(Contact record);

    /**
     * 获取联系我们信息
     * @return
     */
    Map<String,Object> selectDetils();
}