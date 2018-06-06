package com.cn.service.impl;

import com.cn.mapper.AwardsMapper;
import com.cn.service.AwardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AwardsServiceImpl implements AwardsService {

    @Autowired(required = false)
    private AwardsMapper awardsMapper;

    @Override
    public Map<String, Object> selectContent() throws Exception {

        List<Map<String,Object>> selectAwards= new ArrayList<>();
        Map<String,Object> oneAwards = new HashMap<String,Object>();
        String img = new String();
        List<Map<String, Object>> resultAwards = new ArrayList<Map<String,Object>>();
        Map<String,Object> allAwards = new HashMap<String,Object>();

        try {
            selectAwards = awardsMapper.selectContent();
            img = selectAwards.get(0).get("img").toString();
            for (int i = 0;i<selectAwards.size();i++) {
                oneAwards = selectAwards.get(i);
                oneAwards.remove("img");
                resultAwards.add(oneAwards);
            }
            allAwards.put("prize",resultAwards);
            allAwards.put("img",img);

        }catch (Exception e){
            e.printStackTrace();
        }
        return allAwards;
    }
}
