package com.cn.controller;

import com.cn.service.PartnerTeamService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PartnerTeamController {

    @Autowired
    private PartnerTeamService partnerTeamService;

    private Result result ;

    /**
     * 获取合伙人列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/summary/partner")
    public Result selectAllPartner() throws Exception{
        Map<String, Object>  mapList =new HashMap<String, Object>();
        mapList = partnerTeamService.selelctAllPartner();
        result = ResultUtil.success(mapList);
        return result;
    }

    /**
     * 获取团队信息
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/summary/team")
    public Result selectOtherPartner() throws Exception{
        Map<String, Object>  mapList = new HashMap<String, Object>();
        mapList = partnerTeamService.selelctOtherPartner();
        result = ResultUtil.success(mapList);
        return result;
    }
}