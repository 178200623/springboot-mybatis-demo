package com.cn.service.impl;

import com.cn.mapper.PartnerTeamMapper;
import com.cn.model.PartnerTeam;
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
    public List<PartnerTeam> selelctAllPartner(int id) throws Exception {
        PartnerTeam partner;
        List<Map<String, Object>> partnerTeamList = null;
        try {
            partner = partnerTeamMapper.selectAllPartner(id);

        }catch (Exception e){
            e.printStackTrace();
        }
        return partnerTeam;
    }
}
