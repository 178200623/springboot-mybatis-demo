package com.cn.controller;

import com.cn.service.ContactService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    private Result result;

    /**
     * 获取联系我们信息
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/contact")
    public Result selectDetils() throws Exception{
        result = ResultUtil.success(contactService.selectDetils());
        return result;
    }
}
