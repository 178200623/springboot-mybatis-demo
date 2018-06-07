package com.cn.service.impl;

import com.cn.mapper.WorksMapper;
import com.cn.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WorksServiceImpl implements WorksService {

    @Autowired(required = false)
    private WorksMapper worksMapper;

    /**
     * 获取作品列表
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String,Object>> selectListWorks() throws Exception {

        List<Map<String,Object>> allWorks = null;
        try {
            allWorks = worksMapper.selectListWorks();
        }catch (Exception e){
            e.printStackTrace();
        }
        return allWorks;
    }

    /**
     * 获取单个作品
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> selectById(int id) throws Exception {

        List<Map<String,Object>> allWorks = null;
        List<Map<String,Object>> DetailsWorks = new ArrayList<>();
        Map<String,Object> oneWork = new HashMap<String,Object>();
        Map<String,Object> oneWorkContent = new HashMap<String,Object>();
        try {
            allWorks = worksMapper.selectById(id);

            List imglist = new ArrayList();
            for (int i = 0;i < allWorks.size();i++){
                oneWork = allWorks.get(i);
                String img = oneWork.get("img").toString();
                imglist.add(img);
                oneWork.remove("img");
            }
            oneWorkContent.put("img",imglist);
            oneWorkContent.put("content",oneWork);
            DetailsWorks.add(oneWorkContent);
        }catch (Exception e){
            e.printStackTrace();
        }
        return DetailsWorks;
    }
}
