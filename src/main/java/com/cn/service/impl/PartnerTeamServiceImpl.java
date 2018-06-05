package com.cn.service.impl;

import com.cn.mapper.PartnerTeamMapper;
import com.cn.service.PartnerTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerTeamServiceImpl implements PartnerTeamService {
    @Autowired(required = false)
    private PartnerTeamMapper partnerTeamMapper;

    @Override
    public void selelctAllPartner(int id) throws Exception {


    }
}
