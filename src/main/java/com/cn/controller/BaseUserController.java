package com.cn.controller;

import com.cn.model.BaseUser;
import com.cn.service.BaseUserService;
import com.cn.service.impl.BaseUserServiceImpl;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;

    Result result = ResultUtil.success();
    @ResponseBody
    @RequestMapping("/select")
    public Result selectUserById(@RequestParam("id") String id) throws Exception {

        BaseUser str = baseUserService.selectById(id);
        result = ResultUtil.success(str);
        return result;
    }
}
