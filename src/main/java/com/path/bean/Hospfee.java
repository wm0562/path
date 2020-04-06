package com.path.bean;

public class Hospfee {
    private Integer hosId;

    private Integer pid;
    
    private Integer pathId;

    private Integer did;

    private Integer caseId;

    private String opeCost;

    private String postCost;

    private String waitCost;

    private String aveMedCost;

    private String aveDrugCost;

    private String expReim;

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
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

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getOpeCost() {
        return opeCost;
    }

    public void setOpeCost(String opeCost) {
        this.opeCost = opeCost == null ? null : opeCost.trim();
    }

    public String getPostCost() {
        return postCost;
    }

    public void setPostCost(String postCost) {
        this.postCost = postCost == null ? null : postCost.trim();
    }

    public String getWaitCost() {
        return waitCost;
    }

    public void setWaitCost(String waitCost) {
        this.waitCost = waitCost == null ? null : waitCost.trim();
    }

    public String getAveMedCost() {
        return aveMedCost;
    }

    public void setAveMedCost(String aveMedCost) {
        this.aveMedCost = aveMedCost == null ? null : aveMedCost.trim();
    }

    public String getAveDrugCost() {
        return aveDrugCost;
    }

    public void setAveDrugCost(String aveDrugCost) {
        this.aveDrugCost = aveDrugCost == null ? null : aveDrugCost.trim();
    }

    public String getExpReim() {
        return expReim;
    }

    public void setExpReim(String expReim) {
        this.expReim = expReim == null ? null : expReim.trim();
    }

	public Integer getPathId() {
		return pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}
}