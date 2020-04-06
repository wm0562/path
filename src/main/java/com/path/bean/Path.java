package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Path {
    private Integer pathId;

    private String cdepartment;

    private String cname;

    private String cman;

    private String cModifyMan;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date createtime;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date modifytime;

    private String flag;
    
    private String day;

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getCdepartment() {
        return cdepartment;
    }

    public void setCdepartment(String cdepartment) {
        this.cdepartment = cdepartment == null ? null : cdepartment.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCman() {
        return cman;
    }

    public void setCman(String cman) {
        this.cman = cman == null ? null : cman.trim();
    }

    public String getcModifyMan() {
        return cModifyMan;
    }

    public void setcModifyMan(String cModifyMan) {
        this.cModifyMan = cModifyMan == null ? null : cModifyMan.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}