package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Doctor {
    private Integer did;

    private String dname;

    private String dpwd;

    private String ddepartment;

    private String djob;

    private String dage;

    private String dsex;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date zuozhenshijian;
    
    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDpwd() {
        return dpwd;
    }

    public void setDpwd(String dpwd) {
        this.dpwd = dpwd == null ? null : dpwd.trim();
    }

    public String getDdepartment() {
        return ddepartment;
    }

    public void setDdepartment(String ddepartment) {
        this.ddepartment = ddepartment == null ? null : ddepartment.trim();
    }

    public String getDjob() {
        return djob;
    }

    public void setDjob(String djob) {
        this.djob = djob == null ? null : djob.trim();
    }

    public String getDage() {
        return dage;
    }

    public void setDage(String dage) {
        this.dage = dage == null ? null : dage.trim();
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex == null ? null : dsex.trim();
    }

    public Date getZuozhenshijian() {
        return zuozhenshijian;
    }

    public void setZuozhenshijian(Date zuozhenshijian) {
        this.zuozhenshijian = zuozhenshijian;
    }
}