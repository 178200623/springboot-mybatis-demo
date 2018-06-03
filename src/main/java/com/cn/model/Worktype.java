package com.cn.model;

public class Worktype {
    private Integer id;

    private String worktypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorktypeName() {
        return worktypeName;
    }

    public void setWorktypeName(String worktypeName) {
        this.worktypeName = worktypeName == null ? null : worktypeName.trim();
    }
}