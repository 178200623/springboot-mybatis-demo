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

    /**
     * 获取职员列表
     * @param pageNum
     * @param pageCount
     * @return
     * @throws Exception
     */
    Map<String, Object> findAllPartner(int pageNum, int pageCount) throws Exception;


    /**
     * 删除员工
     * @param id
     * @return
     * @throws Exception
     */
    int deleteByPrimaryKey(Integer id) throws Exception;

    /**
     * 更新员工
     * @param body
     * @return
     * @throws Exception
     */
    int updateByPrimaryKey(Map<String,Object> body) throws Exception;
}