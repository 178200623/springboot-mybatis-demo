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
     * @param id
     * @return
     * @throws Exception
     */
    Map<String,Object> selectContentById(int id) throws Exception;

}
