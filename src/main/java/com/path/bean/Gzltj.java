package com.path.bean;

public class Gzltj {
    private Integer gzltjId;

    private Integer pathId;

    private String cname;

    private String szbr;

    private String swbr;

    private String qybr;

    private String hzbr;

    private String blSzbr;

    public Integer getGzltjId() {
        return gzltjId;
    }

    public void setGzltjId(Integer gzltjId) {
        this.gzltjId = gzltjId;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getSzbr() {
        return szbr;
    }

    public void setSzbr(String szbr) {
        this.szbr = szbr == null ? null : szbr.trim();
    }

    public String getSwbr() {
        return swbr;
    }

    public void setSwbr(String swbr) {
        this.swbr = swbr == null ? null : swbr.trim();
    }

    public String getQybr() {
        return qybr;
    }

    public void setQybr(String qybr) {
        this.qybr = qybr == null ? null : qybr.trim();
    }

    public String getHzbr() {
        return hzbr;
    }

    public void setHzbr(String hzbr) {
        this.hzbr = hzbr == null ? null : hzbr.trim();
    }

    public String getBlSzbr() {
        return blSzbr;
    }

    public void setBlSzbr(String blSzbr) {
        this.blSzbr = blSzbr == null ? null : blSzbr.trim();
    }

}