package com.cn.controller;

import com.cn.service.CommentService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    private Result result;

    /**
     *获取评论列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/media/comments")
    public Result selectCommentList() throws Exception {

        result = ResultUtil.success(commentService.selectCommentList());
        return result;
    }

    /**
     * 获取某个评论文章
     * @param id
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/media/comments/{id}")
    public Result selectContentById(@PathVariable("id") int id) throws Exception {

        result = ResultUtil.success(commentService.selectById(id));
        return result;
    }
}
