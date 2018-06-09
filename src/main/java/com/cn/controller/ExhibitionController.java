package com.cn.controller;

import com.cn.service.ExhibitionService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExhibitionController {

    @Autowired(required = false)
    private ExhibitionService exhibitionService;

    private Result result;

    /**
     *
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/media/exhibition")
    public Result selectCommentList() throws Exception {

        result = ResultUtil.success(exhibitionService.selectContent());
        return result;
    }
}
