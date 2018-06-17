package com.cn.service;

import java.util.Map;

public interface IntroductService {
    Map<String,Object> selectContent() throws Exception;

    int updateContent(String content);
}
