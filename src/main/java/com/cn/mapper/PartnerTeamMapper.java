package com.cn.mapper;

import com.cn.model.PartnerTeam;

public interface PartnerTeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartnerTeam record);

    int insertSelective(PartnerTeam record);

    PartnerTeam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartnerTeam record);

    int updateByPrimaryKey(PartnerTeam record);

    PartnerTeam selectAllPartner();
}