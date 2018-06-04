package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.service.BaseUserService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BaseUserControllerTest {

    private Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Autowired
    private BaseUserService baseUserService;

    Result result = ResultUtil.success();
    @Test
    public void selectAllUser() {
        String id ="0001";
        String str = baseUserService.selectById(id);
        result = ResultUtil.success(str);
        Assert.assertNotNull(result);
        logger.debug(JSON.toJSONString(result));
    }
}