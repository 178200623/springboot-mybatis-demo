package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.model.User;
import com.cn.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    private Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void findAllUser(){
        List<User> persons = userService.findAllUser(1,1);

        Assert.assertNotNull(persons);
        logger.debug(JSON.toJSONString(persons));
    }

}