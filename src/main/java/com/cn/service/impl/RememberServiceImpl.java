package com.cn.service.impl;

import com.cn.mapper.RememberMapper;
import com.cn.service.RememberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RememberServiceImpl implements RememberService {

    @Autowired(required = false )
    private RememberMapper rememberMapper;

    /**
     * 获取记事年份列表
     * @return
     * @throws Exception
     */
    @Override
    public Map<String,Object> selectYearList() throws Exception {


        List<Map<String,Object>> yearMap =null;
        List yearList = new ArrayList();
        Map<String ,Object> mapList = new HashMap<String ,Object>();
        try {
            yearMap =rememberMapper.selectYearList();

            for (int i = 0;i < yearMap.size();i++){
                String year = yearMap.get(i).get("year").toString();
                yearList.add(year);
            }
            mapList.put("yearList",yearList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapList;

    }

    /**
     * 获取单年记事
     * @param year
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> selectContentByYear(String year) throws Exception {

        Map<String,Object> contentList =null;
        Map<String,Object> contentMap = new HashMap<String,Object>();
        try {
            contentList = rememberMapper.selectContentByYear(year);
            contentMap.put("memo",contentList);
        }catch (Exception e){
            e.printStackTrace();
        }

        return contentMap;
    }
}
