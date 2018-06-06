package com.cn.service;


import java.util.Map;

public interface PartnerTeamService {

    /**
     * 获取合伙人列表
     * @return
     * @throws Exception
     */
    Map<String, Object>  selelctAllPartner() throws Exception;

    /**
     * 获取团队信息
     * @return
     * @throws Exception
     */
    Map<String, Object>  selelctOtherPartner() throws Exception;
}