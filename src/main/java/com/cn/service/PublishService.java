package com.cn.service;

import java.util.Map;

public interface PublishService {

    /**
     * 获取作品中出版年份列表
     * @return
     * @throws Exception
     */
    Map<String,Object> selectYearList() throws Exception;

    /**
     * 获取某年出版列表
     * @param year
     * @return
     * @throws Exception
     */
    Map<String,Object> selectContentByYear(String year) throws Exception;
}
