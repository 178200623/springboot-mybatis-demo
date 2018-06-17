package com.cn.controller;

import com.cn.service.IntroductService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IntroductController {

    @Autowired
    private IntroductService introductService;

    private Result result ;
    @ResponseBody
    @RequestMapping(value = "/api/summary/introduction",method = RequestMethod.GET)
    public Result selectContent() throws Exception {

        result = ResultUtil.success(introductService.selectContent());
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/api/summary/introduction",method = RequestMethod.POST)
    public Result updateContent(@RequestParam("introduction") String introduction) throws Exception {

        int res = introductService.updateContent(introduction);
        if (res > 0)
            result = ResultUtil.success(2000,"上传成功");
        else {
            result = ResultUtil.error(3000,"上传失败");
        }
        return result;
    }
}
