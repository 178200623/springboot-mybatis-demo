package com.cn.service.impl;

import com.cn.mapper.IntroductMapper;
import com.cn.model.Introduct;
import com.cn.service.IntroductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IntroductServiceImpl implements IntroductService {

    @Autowired(required = false)
    private IntroductMapper introductMapper;

    @Override
    public String selectContent() throws Exception {
        Introduct introduct = null;
        String content = null;
        try {
            introduct = introductMapper.selectContentById(1);
            content = introduct.getContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
