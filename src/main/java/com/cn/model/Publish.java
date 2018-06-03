package com.cn.model;

import java.util.Date;

public class Publish {
    private Integer id;

    private String publishName;

    private Date publishTime;

    private String description;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private String status;

    private Integer publishImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName == null ? null : publishName.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getPublishImg() {
        return publishImg;
    }

    public void setPublishImg(Integer publishImg) {
        this.publishImg = publishImg;
    }
}