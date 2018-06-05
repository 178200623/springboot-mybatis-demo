package com.cn.controller;

import com.cn.service.PartnerTeamService;
import com.cn.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartnerTeamController {

    @Autowired
    private PartnerTeamService partnerTeamService;

    private Result result ;
    @ResponseBody
    @RequestMapping("/api/summary/partner")
    public Result selectAllPartner() throws Exception{

        partnerTeamService.selelctAllPartner();
        return result
    }
}
