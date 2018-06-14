package com.cn.service.impl;

import com.cn.mapper.BaseUserMapper;
import com.cn.model.BaseUser;
import com.cn.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired(required = false)
    private BaseUserMapper baseUserMapper;

    @Override
    public BaseUser selectById(String id) throws Exception{
        BaseUser baseUser = null;
        try {
             baseUser =  baseUserMapper.selectByPrimaryKey(id);

        }catch (Exception e){
            e.printStackTrace();
        }
        return baseUser;
    }

    @Override
    public boolean login(Map<String,Object> body) throws Exception {
        String user = body.get("user").toString();
        String password = body.get("password").toString();
        BaseUser baseUser = new BaseUser();
        baseUser.setUsername(user);
        baseUser.setPassword(password);
        Map<String,Object> re =null;
        try {
          re = baseUserMapper.login(baseUser);

        }catch (Exception e){
            e.printStackTrace();
        }


        if (re != null && re.size() > 0){
            return true;
        }else {
            return false;
        }
    }
}
