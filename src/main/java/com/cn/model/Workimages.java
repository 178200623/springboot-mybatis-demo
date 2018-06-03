package com.cn.model;

public class Workimages {
    private Integer id;

    private Integer imageId;

    private String imagePath;

    private Integer mainfigure;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public Integer getMainfigure() {
        return mainfigure;
    }

    public void setMainfigure(Integer mainfigure) {
        this.mainfigure = mainfigure;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}