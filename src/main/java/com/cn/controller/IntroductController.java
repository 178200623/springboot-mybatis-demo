package com.cn.controller;

import com.cn.model.Introduct;
import com.cn.service.IntroductService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroductController {

    @Autowired
    private IntroductService introductService;

    private Result result ;
    @ResponseBody
    @RequestMapping("/api/summary/introduction")
    public Result selectContent() throws Exception {

        String str = introductService.selectContent();
        result = ResultUtil.success(str);
        return result;
    }
}
