package com.cn.mapper;

import com.cn.model.Comment;

import java.util.List;
import java.util.Map;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    /**
     *获取评论列表
     * @return
     */
    List<Map<String,Object>> selectCommentList();

    /**
     * 获取某个评论文章
     * @param id
     * @return
     */
    Comment selectById(Integer id);
}