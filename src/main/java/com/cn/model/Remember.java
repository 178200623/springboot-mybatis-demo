package com.cn.model;

import java.util.Date;

public class Remember {
    private Integer id;

    private Date rememberTime;

    private String description;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRememberTime() {
        return rememberTime;
    }

    public void setRememberTime(Date rememberTime) {
        this.rememberTime = rememberTime;
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
}