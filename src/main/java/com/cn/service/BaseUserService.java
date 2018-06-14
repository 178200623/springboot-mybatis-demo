package com.cn.service;

import com.cn.model.BaseUser;

import java.util.Map;

public interface BaseUserService {

    BaseUser selectById(String id) throws Exception;

    boolean login(Map<String,Object> body) throws Exception;
}
