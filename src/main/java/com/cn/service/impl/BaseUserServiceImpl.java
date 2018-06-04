package com.cn.service.impl;

import com.cn.mapper.BaseUserMapper;
import com.cn.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired(required = false)
    private BaseUserMapper baseUserMapper;

    @Override
    public String selectById(String id) {

        return baseUserMapper.selectByPrimaryKey(id);
    }
}
