package com.cn.service.impl;

import com.cn.mapper.IntroductMapper;
import com.cn.model.Introduct;
import com.cn.service.IntroductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
