package com.cn.model;

import java.util.Date;

public class Works {
    private Integer id;

    private String workName;

    private String worktypeId;

    private String constructionsite;

    private String coveredarea;

    private Date designstartTime;

    private Date designstopTime;

    private Date completionTime;

    private String designId;

    private String designName;

    private String description;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private Integer commentId;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public String getWorktypeId() {
        return worktypeId;
    }

    public void setWorktypeId(String worktypeId) {
        this.worktypeId = worktypeId == null ? null : worktypeId.trim();
    }

    public String getConstructionsite() {
        return constructionsite;
    }

    public void setConstructionsite(String constructionsite) {
        this.constructionsite = constructionsite == null ? null : constructionsite.trim();
    }

    public String getCoveredarea() {
        return coveredarea;
    }

    public void setCoveredarea(String coveredarea) {
        this.coveredarea = coveredarea == null ? null : coveredarea.trim();
    }

    public Date getDesignstartTime() {
        return designstartTime;
    }

    public void setDesignstartTime(Date designstartTime) {
        this.designstartTime = designstartTime;
    }

    public Date getDesignstopTime() {
        return designstopTime;
    }

    public void setDesignstopTime(Date designstopTime) {
        this.designstopTime = designstopTime;
    }

    public Date getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId == null ? null : designId.trim();
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName == null ? null : designName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}