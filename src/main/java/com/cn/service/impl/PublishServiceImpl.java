package com.cn.service.impl;

import com.cn.mapper.PublishMapper;
import com.cn.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PublishServiceImpl implements PublishService {

    @Autowired(required =false)
    private PublishMapper publishMapper;

    @Override
    public Map<String, Object> selectYearList() throws Exception {

        List<Map<String,Object>> yearsMap =null;
        List yearsList = new ArrayList();
        Map<String ,Object> mapList = new HashMap<String ,Object>();
        try {
            yearsMap =publishMapper.selectYearList();

            for (int i = 0;i < yearsMap.size();i++){
                String year = yearsMap.get(i).get("year").toString();
                yearsList.add(year);
            }
            mapList.put("yearList",yearsList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapList;
    }

    @Override
    public Map<String, Object> selectContentByYear(String year) throws Exception {

        List<Map<String,Object>> publishList =null;

        Map<String,Object> contentMap = new HashMap<String,Object>();
        String str = new String();
        try {
            publishList = publishMapper.selectPublishByYear(year);
            List<Map<String,Object>> oneList = new ArrayList<>();

            for (int i =0;i<publishList.size();i++){
                Map<String,Object> onetMap = new HashMap<String,Object>();
                String name =publishList.get(i).get("name").toString();
                String time =publishList.get(i).get("time").toString();
                String description =publishList.get(i).get("description").toString();
                String img =publishList.get(i).get("img").toString();
                str = name +time +","+description;
                onetMap.clear();
                onetMap.put("content",str);
                onetMap.put("img",img);
                oneList.add(onetMap);
            }
            contentMap.put("publish",oneList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return contentMap;
    }
}
