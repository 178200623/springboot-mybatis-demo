package com.cn.service.impl;

import com.cn.mapper.PartnerTeamMapper;
import com.cn.service.PartnerTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PartnerTeamServiceImpl implements PartnerTeamService {
    @Autowired(required = false)
    private PartnerTeamMapper partnerTeamMapper;


    @Override
    public List<Map<String, Object>> selelctAllPartner(int id) throws Exception {

        return partnerTeamMapper.selectAllPartner(id);
    }
}
