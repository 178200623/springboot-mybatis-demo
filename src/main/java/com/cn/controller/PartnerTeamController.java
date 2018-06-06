package com.cn.controller;

import com.cn.service.PartnerTeamService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PartnerTeamController {

    @Autowired
    private PartnerTeamService partnerTeamService;

    private Result result ;
    @ResponseBody
    @RequestMapping("/api/summary/partner")
    public Result selectAllPartner() throws Exception{
        List<Map<String, Object>> mapList = null;
        mapList = partnerTeamService.selelctAllPartner();
        result = ResultUtil.success(mapList);
        return result;
    }
}