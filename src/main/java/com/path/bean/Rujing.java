package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Rujing {
    private Integer rujId;

    private Integer pid;

    private String status;
    
    private String stage;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date entrytime;

    private String rujPath;

    public Integer getRujId() {
        return rujId;
    }

    public void setRujId(Integer rujId) {
        this.rujId = rujId;
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

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage  == null ? null : status.trim();
	}
	
    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getRujPath() {
        return rujPath;
    }

    public void setRujPath(String rujPath) {
        this.rujPath = rujPath == null ? null : rujPath.trim();
    }

}