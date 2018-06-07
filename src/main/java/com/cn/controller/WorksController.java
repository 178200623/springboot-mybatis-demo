package com.cn.controller;

import com.cn.service.WorksService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class WorksController {

    @Autowired
    private WorksService worksService;

    private Result result;

    /**
     * 获取作品列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/works")
    public Result selectListWorks() throws Exception{

        result = ResultUtil.success(worksService.selectListWorks());

        return result;
    }

    /**
     * 获取作品列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/works/{id}")
    public Result selectById(@PathVariable("id") int id) throws Exception{

        result = ResultUtil.success(worksService.selectById(id));

        return result;
    }
}
