package com.cn.model;

import java.util.Date;

public class Exhibition {
    private Integer id;

    private Date exhibitTime;

    private String exhibitName;

    private String exhibitAddress;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private String status;

    private Integer exhibitImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getExhibitTime() {
        return exhibitTime;
    }

    public void setExhibitTime(Date exhibitTime) {
        this.exhibitTime = exhibitTime;
    }

    public String getExhibitName() {
        return exhibitName;
    }

    public void setExhibitName(String exhibitName) {
        this.exhibitName = exhibitName == null ? null : exhibitName.trim();
    }

    public String getExhibitAddress() {
        return exhibitAddress;
    }

    public void setExhibitAddress(String exhibitAddress) {
        this.exhibitAddress = exhibitAddress == null ? null : exhibitAddress.trim();
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

    public Integer getExhibitImg() {
        return exhibitImg;
    }

    public void setExhibitImg(Integer exhibitImg) {
        this.exhibitImg = exhibitImg;
    }
}