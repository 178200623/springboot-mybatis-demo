package com.cn.service;

import java.util.Map;

public interface ExhibitionService {

    /**
     * 获取展览列表
     * @return
     * @throws Exception
     */
    Map<String,Object> selectContent() throws Exception;
}
