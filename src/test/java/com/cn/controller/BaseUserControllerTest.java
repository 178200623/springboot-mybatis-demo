package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.model.BaseUser;
import com.cn.service.BaseUserService;
import com.cn.service.impl.BaseUserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseUserControllerTest {

    private Logger logger = LoggerFactory.getLogger(BaseUserControllerTest.class);

    @Autowired
    private BaseUserService baseUserService = new BaseUserServiceImpl();
    @Test
    public void selectUserById() {
        String id = "0001";
        BaseUser baseUser = baseUserService.selectById(id);

        Assert.assertNotNull(baseUser);
        logger.debug(JSON.toJSONString(baseUser));
    }
}