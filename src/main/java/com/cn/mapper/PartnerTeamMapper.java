package com.cn.mapper;

import com.cn.model.PartnerTeam;

import java.util.List;
import java.util.Map;

public interface PartnerTeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartnerTeam record);

    int insertSelective(PartnerTeam record);

    PartnerTeam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartnerTeam record);

    int updateByPrimaryKey(PartnerTeam record);

    List<Map<String, Object>> selectAllPartner(String id);

    List<Map<String, Object>> selectOtherPartner();

    List<Map<String, Object>> selectPartner();
}