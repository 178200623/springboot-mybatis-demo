package com.cn.service.impl;

import com.cn.mapper.ExhibitionMapper;
import com.cn.service.ExhibitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExhibitionServiceImpl implements ExhibitionService {

    @Autowired(required =  false)
    private ExhibitionMapper exhibitionMapper;

    /**
     * 获取展览列表
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> selectContent() throws Exception {

        List<Map<String,Object>> mapList = null;

        Map<String,Object> allExhibition = new HashMap<String,Object>();
        String content = new String();

        try {
            mapList = exhibitionMapper.selectContent();
            List<Map<String,Object>>  oneList = new ArrayList();
            for (int i=0;i<mapList.size();i++){
                Map<String,Object> oneExhibition = new HashMap<String,Object>();
                String year = mapList.get(i).get("time").toString();
                String name = mapList.get(i).get("name").toString();
                String address = mapList.get(i).get("address").toString();
                String img = mapList.get(i).get("img").toString();
                content = name+","+address;
                oneExhibition.clear();
                oneExhibition.put("year",year);
                oneExhibition.put("content",content);
                oneExhibition.put("img",img);
                oneList.add(oneExhibition);
            }
            allExhibition.put("exhibitions",oneList);
        }catch (Exception e){
            e.printStackTrace();
        }

        return allExhibition;
    }
}
