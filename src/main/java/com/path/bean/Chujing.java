package com.path.bean;

import java.util.Date;

public class Chujing {
    private Integer chujId;

    private Integer pid;

    private String chujPath;

    private Date outtime;

    public Integer getChujId() {
        return chujId;
    }

    public void setChujId(Integer chujId) {
        this.chujId = chujId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getChujPath() {
        return chujPath;
    }

    public void setChujPath(String chujPath) {
        this.chujPath = chujPath == null ? null : chujPath.trim();
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }
}