package com.cn.service;

import com.cn.model.Comment;

import java.util.Map;

public interface CommentService {


    /**
     * 获取评论列表
     * @return
     */
    Map<String,Object> selectCommentList() throws Exception;

    /**
     * 获取某个评论文章
     * @param id
     * @return
     */
    Map<String,Object> selectById(Integer id) throws Exception;
}
