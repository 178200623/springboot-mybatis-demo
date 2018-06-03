package com.cn.mapper;

import com.cn.model.Contact;

public interface ContactMapper {
    int insert(Contact record);

    int insertSelective(Contact record);
}