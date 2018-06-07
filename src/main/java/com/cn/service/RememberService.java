package com.cn.service;

import java.util.Map;

public interface RememberService {

    /**
     * 获取记事年份列表
     * @return
     * @throws Exception
     */
    Map<String,Object> selectYearList() throws Exception;

    /**
     * 获取单年记事
     * @param year
     * @return
     * @throws Exception
     */
    Map<String,Object> selectContentByYear(String year) throws Exception;

}
