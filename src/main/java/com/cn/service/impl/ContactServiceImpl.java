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
        Map<String,Object> contact = new HashMap<String,Object>();
        Map<String,Object> context = new HashMap<String,Object>();
        Map<String,Object> contactDetil = new HashMap<String,Object>();
        try {
            List<Map<String ,Object>> list = new ArrayList<>();
            mapDetils = contactMapper.selectDetils();
            String imgPath = mapDetils.get("img").toString();
            String address = mapDetils.get("address").toString();
            String zipcode = mapDetils.get("zipcode").toString();
            String telephone = mapDetils.get("telephone").toString();
            String fax = mapDetils.get("fax").toString();
            String ec_mail = mapDetils.get("ec_mail").toString();
            String bm_mail = mapDetils.get("bm_mail").toString();
            String rp_mail = mapDetils.get("rp_mail").toString();

            context.put("label","地址");
            context.put("text",address);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","邮编");
            context.put("text",zipcode);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","电话");
            context.put("text",telephone);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","传真");
            context.put("text",fax);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","工程联络信箱");
            context.put("text",ec_mail);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","商务媒体信箱");
            context.put("text",bm_mail);
            list.add(context);
            context = new HashMap<String,Object>();
            context.put("label","招聘实习信箱");
            context.put("text",rp_mail);
            list.add(context);

            contact.put("img",imgPath);
            contact.put("context",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        contactDetil.put("contact",contact);

        return contactDetil;
    }
}
