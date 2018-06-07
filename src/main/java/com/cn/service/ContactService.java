package com.cn.service;

import java.util.Map;

public interface ContactService {

    /**
     * 获取联系我们信息
     * @return
     * @throws Exception
     */
    Map<String,Object> selectDetils() throws Exception;
}
