package com.cn.service.impl;

import com.cn.mapper.IntroductMapper;
import com.cn.model.Introduct;
import com.cn.service.IntroductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;


@Service
public class IntroductServiceImpl implements IntroductService {

    @Autowired(required = false)
    private IntroductMapper introductMapper;

    @Override
    public Map<String,Object> selectContent() throws Exception {
        Map<String,Object> introduct = null;
        String content = null;
        try {
            introduct = introductMapper.selectContentById();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return introduct;
    }


    @Override
    public int updateContent(String content) {

        Introduct introduct = new Introduct();
        introduct.setContent(content);
        introduct.setId(1);
        Date date = new Date();
        introduct.setLastModifyTime(date);
        introduct.setLastModifyUserId("0001");
        return introductMapper.updateContent(introduct);
    }
}
