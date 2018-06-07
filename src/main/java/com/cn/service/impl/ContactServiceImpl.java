package com.cn.service.impl;

import com.cn.mapper.ContactMapper;
import com.cn.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired(required = false)
    private ContactMapper contactMapper;

    /**
     * 获取联系我们信息
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> selectDetils() throws Exception {

        Map<String,Object> mapDetils = new HashMap<>();
        Map<String,Object> contact = new HashMap<>();
        Map<String,Object> context = new HashMap<>();
        try {
            List<Map<String ,Object>> list = new ArrayList<>();
            mapDetils = contactMapper.selectDetils();
            String imgPath = mapDetils.get("img").toString();
            context.put("地址",mapDetils.get("address").toString());
            context.put("邮编",mapDetils.get("zipcode").toString());
            context.put("电话",mapDetils.get("telephone").toString());
            context.put("传真",mapDetils.get("fax").toString());
            context.put("工程联络信箱",mapDetils.get("ec_mail").toString());
            context.put("商务媒体信箱",mapDetils.get("bm_mail").toString());
            context.put("招聘实习信箱",mapDetils.get("rp_mail").toString());
            list.add(context);
            contact.put("img",imgPath);
            contact.put("context",list);
        }catch (Exception e){
            e.printStackTrace();
        }


        return contact;
    }
}
