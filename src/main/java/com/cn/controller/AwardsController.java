package com.cn.controller;

import com.cn.service.AwardsService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AwardsController {
    @Autowired
    private AwardsService awardsService;

    private Result result ;

    @ResponseBody
    @RequestMapping("/api/summary/prize")
    public Result selectAllPartner() throws Exception{
        Map<String, Object> mapList =new HashMap<String, Object>();
        mapList = awardsService.selectContent();
        result = ResultUtil.success(mapList);
        return result;
    }
}
