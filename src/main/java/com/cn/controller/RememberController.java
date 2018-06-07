package com.cn.controller;

import com.cn.service.RememberService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RememberController {

    @Autowired
    private RememberService rememberService;

    private Result result;

    /**
     * 获取记事年份列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("api/memo/yearlist")
    public Result selectYearList() throws Exception{

        result = ResultUtil.success( rememberService.selectYearList());

        return result;
    }

    /**
     * 获取单年记事
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("api/memo/{year}")
    public Result selectContentByYear(@PathVariable("year") String year ) throws Exception{

        result = ResultUtil.success(rememberService.selectContentByYear(year));

        return result;
    }
}
