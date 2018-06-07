package com.cn.service;

import java.util.List;
import java.util.Map;

public interface WorksService {

    /**
     * 获取作品列表
     * @return
     * @throws Exception
     */
    List<Map<String,Object>> selectListWorks() throws Exception;

    /**
     * 获取单个作品
     * @return
     * @throws Exception
     */
    List<Map<String,Object>> selectById(int id) throws Exception;
}
