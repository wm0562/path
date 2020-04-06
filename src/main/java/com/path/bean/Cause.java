package com.path.bean;

public class Cause {
    private Integer causeId;

    private Integer depId;

    private Integer pathId;

    private String depName;

    private String rjbr;

    private String cjbr;

    private String cause;

    public Integer getCauseId() {
        return causeId;
    }

    public void setCauseId(Integer causeId) {
        this.causeId = causeId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

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

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
}