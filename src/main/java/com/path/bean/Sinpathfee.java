package com.path.bean;

public class Sinpathfee {
    private Integer pathfeeId;

    private Integer pid;

    private Integer did;

    private Integer pathId;

    private String hospExp;

    private String medExp;

    private String drugExp;

    private Integer caseId;

    public Integer getPathfeeId() {
        return pathfeeId;
    }

    public void setPathfeeId(Integer pathfeeId) {
        this.pathfeeId = pathfeeId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getHospExp() {
        return hospExp;
    }

    public void setHospExp(String hospExp) {
        this.hospExp = hospExp == null ? null : hospExp.trim();
    }

    public String getMedExp() {
        return medExp;
    }

    public void setMedExp(String medExp) {
        this.medExp = medExp == null ? null : medExp.trim();
    }

    public String getDrugExp() {
        return drugExp;
    }

    public void setDrugExp(String drugExp) {
        this.drugExp = drugExp == null ? null : drugExp.trim();
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }
}