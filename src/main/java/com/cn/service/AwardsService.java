package com.cn.service;

import java.util.Map;

public interface AwardsService {

    /**
     * 获取奖项列表
     * @return
     * @throws Exception
     */
    Map<String,Object> selectContent() throws Exception;
}
