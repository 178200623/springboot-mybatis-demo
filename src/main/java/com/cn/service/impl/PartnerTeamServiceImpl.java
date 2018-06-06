package com.cn.service.impl;

import com.cn.mapper.PartnerTeamMapper;
import com.cn.service.PartnerTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PartnerTeamServiceImpl implements PartnerTeamService {
    @Autowired(required = false)
    private PartnerTeamMapper partnerTeamMapper;


    @Override
    public List<Map<String, Object>> selelctAllPartner() {

        List<Map<String, Object>> listPar = partnerTeamMapper.selectPartner();
        List<Map<String, Object>> listAllPar = null;
        Map<String, Object> listAllParOne = null;
        List<Map<String, Object>> all = new ArrayList<Map<String,Object>>();
        if(listPar.size() > 0 ){
            for(int i = 0;i<listPar.size(); i++){
                listAllParOne = new HashMap<String, Object>();
                String partner_id = listPar.get(i).get("Parend_id").toString();
                listAllPar = partnerTeamMapper.selectAllPartner(partner_id);
                if(listAllPar.size() > 0) {
                    List<String> list = new ArrayList<String>();
                    String name = listAllPar.get(0).get("name").toString();
                    for (int a = 0;a <listAllPar.size();a++){
                        String  resume = listAllPar.get(a).get("resume").toString();
                        list.add(resume);
                    }
                    listAllParOne.clear();
                    listAllParOne.put("name",name);
                    listAllParOne.put("resume",list);
                }
                all.add(listAllParOne);

            }
        }
        return all;
    }

}
