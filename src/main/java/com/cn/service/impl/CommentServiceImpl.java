package com.cn.service.impl;

import com.cn.mapper.CommentMapper;
import com.cn.model.Comment;
import com.cn.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    /**
     * 获取评论列表
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> selectCommentList() throws Exception{

        List<Map<String ,Object>> commentList = null;
        Map<String,Object> mapList = new HashMap<String,Object>();
        try {
            commentList = commentMapper.selectCommentList();

            mapList.put("commentList",commentList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapList;
    }

    /**
     * 获取某个评论文章
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Map<String,Object> selectById(Integer id) throws Exception{

        Comment comment = new Comment();
        Map<String ,Object> mapComment = new HashMap<String ,Object>();
        try {
            comment = commentMapper.selectById(id);
            mapComment.put("comment",comment);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapComment;
    }
}
