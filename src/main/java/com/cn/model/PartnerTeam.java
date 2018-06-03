package com.cn.model;

import java.util.Date;

public class PartnerTeam {
    private Integer id;

    private String parendId;

    private String name;

    private String sex;

    private Date birthday;

    private String address;

    private String contactphone;

    private String nationalitycode;

    private String nationcaode;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private Integer positionId;

    private Integer departmentId;

    private String remark;

    private String status;

    private Integer partnerImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParendId() {
        return parendId;
    }

    public void setParendId(String parendId) {
        this.parendId = parendId == null ? null : parendId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getNationalitycode() {
        return nationalitycode;
    }

    public void setNationalitycode(String nationalitycode) {
        this.nationalitycode = nationalitycode == null ? null : nationalitycode.trim();
    }

    public String getNationcaode() {
        return nationcaode;
    }

    public void setNationcaode(String nationcaode) {
        this.nationcaode = nationcaode == null ? null : nationcaode.trim();
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

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getPartnerImg() {
        return partnerImg;
    }

    public void setPartnerImg(Integer partnerImg) {
        this.partnerImg = partnerImg;
    }
}