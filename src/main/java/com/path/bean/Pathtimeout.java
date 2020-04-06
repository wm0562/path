package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Pathtimeout {
    private Integer timeoutId;

    private Integer pid;
    
    private Integer pathId;

    private String csPath;
    
    private String status;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date entrytime;

    private String tDays;

    public Integer getTimeoutId() {
        return timeoutId;
    }

    public void setTimeoutId(Integer timeoutId) {
        this.timeoutId = timeoutId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String gettDays() {
        return tDays;
    }

    public void settDays(String tDays) {
        this.tDays = tDays == null ? null : tDays.trim();
    }

	public Integer getPathId() {
		return pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}

	public String getCsPath() {
		return csPath;
	}

	public void setCsPath(String csPath) {
		this.csPath = csPath == null ? null : csPath.trim();
	}
}
