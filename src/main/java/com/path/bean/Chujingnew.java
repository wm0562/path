package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Chujingnew {
	private Integer pid;
	private String pname;
	private String psex;
	private String chujPath;
	private String flag;
	private String variationRecorde;
	private String feedback;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date outtime;
    
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
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
	public String getChujPath() {
		return chujPath;
	}
	public void setChujPath(String chujPath) {
		this.chujPath = chujPath;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getVariationRecorde() {
		return variationRecorde;
	}
	public void setVariationRecorde(String variationRecorde) {
		this.variationRecorde = variationRecorde ;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
