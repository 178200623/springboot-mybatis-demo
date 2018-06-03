package com.cn.model;

import java.util.Date;

public class Awards {
    private Integer id;

    private Date awardsdateTime;

    private String awardsName;

    private String status;

    private Integer awardImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAwardsdateTime() {
        return awardsdateTime;
    }

    public void setAwardsdateTime(Date awardsdateTime) {
        this.awardsdateTime = awardsdateTime;
    }

    public String getAwardsName() {
        return awardsName;
    }

    public void setAwardsName(String awardsName) {
        this.awardsName = awardsName == null ? null : awardsName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getAwardImg() {
        return awardImg;
    }

    public void setAwardImg(Integer awardImg) {
        this.awardImg = awardImg;
    }
}