package com.cn.model;

import java.util.Date;

public class Contact {
    private String address;

    private String zipcode;

    private String telephone;

    private String fax;

    private String ecMail;

    private String bmMail;

    private String rpMail;

    private Date createTime;

    private String createUser;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private String status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEcMail() {
        return ecMail;
    }

    public void setEcMail(String ecMail) {
        this.ecMail = ecMail == null ? null : ecMail.trim();
    }

    public String getBmMail() {
        return bmMail;
    }

    public void setBmMail(String bmMail) {
        this.bmMail = bmMail == null ? null : bmMail.trim();
    }

    public String getRpMail() {
        return rpMail;
    }

    public void setRpMail(String rpMail) {
        this.rpMail = rpMail == null ? null : rpMail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
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