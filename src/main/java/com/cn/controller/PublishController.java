package com.cn.controller;

import com.cn.service.PublishService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PublishController {

    @Autowired
    private PublishService publishService;

    private Result result ;

    /**
     * 获取作品中出版年份列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/media/publish/yearlist")
    public Result selectAllPartner() throws Exception{

        result = ResultUtil.success(publishService.selectYearList());
        return result;
    }

    /**
     * 获取某年出版列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/media/publish/{year}")
    public Result selectOtherPartner(@PathVariable("year") String year) throws Exception{

        result = ResultUtil.success(publishService.selectContentByYear(year));
        return result;
    }
}
