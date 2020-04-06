package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Pathtimeoutnew {

    private Integer pid;
    
    private String pname;
    
    private String psex;

    private String csPath;
    
    private String status;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date entrytime;

    private String day;
    
    private String tDays;


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

	public String getCsPath() {
		return csPath;
	}

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
    
    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex == null ? null : psex.trim();
    }

	public void setCsPath(String csPath) {
		this.csPath = csPath == null ? null : csPath.trim();
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		 this.day = day == null ? null : day.trim();
	}
}













