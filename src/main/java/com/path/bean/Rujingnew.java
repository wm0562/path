package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Rujingnew {

	private Integer pid;
	private String pname;
	private String psex;
	private String rujPath;
	private String status;
	private String stage;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date entrytime;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPsex() {
		return psex;
	}

	public void setPsex(String psex) {
		this.psex = psex;
	}

	public String getRujPath() {
		return rujPath;
	}

	public void setRujPath(String rujPath) {
		this.rujPath = rujPath;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}
    
    

}
