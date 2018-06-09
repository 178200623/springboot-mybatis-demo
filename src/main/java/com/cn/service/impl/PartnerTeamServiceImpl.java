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
    public Map<String, Object> selelctAllPartner() {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Map<String, Object>> listAllResume = null;
        Map<String, Object> listOneResume= null;
        try {
            List<Map<String, Object>> listPar = partnerTeamMapper.selectPartner();
            String img = listPar.get(0).get("img").toString();
            List<Map<String, Object>> resultPartnerResume = new ArrayList<Map<String,Object>>();
            List listResult = new ArrayList();
            if(listPar.size() > 0 ){
                for(int i = 0;i<listPar.size(); i++){
                    listOneResume = new HashMap<String, Object>();
                    String partner_id = listPar.get(i).get("ParendId").toString();
                    listAllResume = partnerTeamMapper.selectAllPartner(partner_id);
                    if(listAllResume.size() > 0) {
                        List<String> listResume = new ArrayList<String>();
                        String name = listAllResume.get(0).get("name").toString();
                        for (int a = 0;a <listAllResume.size();a++){
                            String  resume = listAllResume.get(a).get("resume").toString();
                            listResume.add(resume);
                        }
                        listOneResume.clear();
                        listOneResume.put("name",name);
                        listOneResume.put("experience",listResume);
                    }
                    resultPartnerResume.add(listOneResume);
                }
            }
            listResult.add(resultPartnerResume);
            result.put("partner",listResult);
            result.put("img",img);
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Map<String, Object> selelctOtherPartner() {

        Map<String, Object> resultOther = new HashMap<String, Object>();
        List<Map<String, Object>> listOtherResume = null;
        Map<String, Object> listOneResume= null;
        Map<String, Object> listTeam = new HashMap<>();
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            List<Map<String, Object>> listOtherPar = partnerTeamMapper.selectOtherPartner();
            String img = listOtherPar.get(0).get("img").toString();
            String title = listOtherPar.get(0).get("title").toString();
            List resultPartnerResume = new ArrayList<Map<String,Object>>();
            if(listOtherPar.size() > 0 ){
                for(int i = 0;i<listOtherPar.size(); i++){
                    listOneResume = new HashMap<String, Object>();
                    String partner_id = listOtherPar.get(i).get("ParendId").toString();
                    listOtherResume = partnerTeamMapper.selectAllPartner(partner_id);
                    if(listOtherResume.size() > 0) {
                        List<String> listResume = new ArrayList<String>();
                        String name = listOtherResume.get(0).get("name").toString();
                        for (int a = 0;a <listOtherResume.size();a++){
                            String  resume = listOtherResume.get(a).get("resume").toString();
                            listResume.add(resume);
                        }
                        listOneResume.clear();
                        listOneResume.put("name",name);
                        listOneResume.put("experience",listResume);
                    }
                    resultPartnerResume.add(listOneResume);
                }
            }
            resultOther.put("title",title);
            resultOther.put("member",resultPartnerResume);
            list.add(resultOther);
            listTeam.put("team",list);
            listTeam.put("img",img);
        }catch (Exception e){
            e.printStackTrace();
        }

        return listTeam;
    }

}