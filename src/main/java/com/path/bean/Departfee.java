package com.path.bean;

public class Departfee {
    private Integer departId;

    private Integer pid;

    private Integer pathId;

    private String pdepartment;

    private Integer did;

    private Integer caseId;

    private Double departFee;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPdepartment() {
        return pdepartment;
    }

    public void setPdepartment(String pdepartment) {
        this.pdepartment = pdepartment == null ? null : pdepartment.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Double getDepartFee() {
        return departFee;
    }

    public void setDepartFee(Double departFee) {
        this.departFee = departFee;
    }

	public Integer getPathId() {
		return pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}
}