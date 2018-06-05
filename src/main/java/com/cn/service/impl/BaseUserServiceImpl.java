package com.cn.service.impl;

import com.cn.mapper.BaseUserMapper;
import com.cn.model.BaseUser;
import com.cn.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired(required = false)
    private BaseUserMapper baseUserMapper;

    @Override
    public BaseUser selectById(String id) {

        BaseUser baseUser =  baseUserMapper.selectByPrimaryKey(id);
        return baseUser;
    }
}
