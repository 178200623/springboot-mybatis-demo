package com.cn.controller;

import com.cn.service.BaseUserService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController("/base")
public class BaseUserController {

    private Logger logger = LoggerFactory.getLogger(BaseUserController.class);
    @Autowired
    private BaseUserService baseUserService;

    Result result = ResultUtil.success();
    @ResponseBody
    @RequestMapping("/select")
    public Result selectAllUser(String id){

        String str = baseUserService.selectById("1");
        result = ResultUtil.success(str);
        return result;
    }
}
