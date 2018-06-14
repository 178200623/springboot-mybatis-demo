package com.cn.controller;

import com.cn.model.BaseUser;
import com.cn.service.BaseUserService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.Map;


@RestController
public class BaseUserController extends HandlerInterceptorAdapter {

    @Autowired
    private BaseUserService baseUserService;

    private Result result;
    @ResponseBody
    @RequestMapping("/select")
    public Result selectUserById(@RequestParam("id") String id) throws Exception {

        BaseUser str = baseUserService.selectById(id);
        result = ResultUtil.success(str);
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result loginVerify(@RequestBody Map<String,Object> body) throws Exception{


        boolean re = baseUserService.login(body);
        if (re == true){
            result = ResultUtil.success();
        }else {
            result = ResultUtil.error(3000,"登录失败");
        }
        return  result;
    }



}
