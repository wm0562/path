package com.path.bean;

public class Causenew {

    private String depName;
    
    private String cname;
    
    private String rjbr;

    private String cjbr;

    private String cause;

    public String getRjbr() {
        return rjbr;
    }

    public void setRjbr(String rjbr) {
        this.rjbr = rjbr == null ? null : rjbr.trim();
    }

    public String getCjbr() {
        return cjbr;
    }

    public void setCjbr(String cjbr) {
        this.cjbr = cjbr == null ? null : cjbr.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
}