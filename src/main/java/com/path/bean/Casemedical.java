package com.path.bean;

import java.util.Date;

public class Casemedical {
    private Integer caseId;

    private Integer pid;

    private Integer did;

    private Date visitTime;

    private String visitHistory;

    private String treatResult;

    private String recomPathid;

    private String zresult;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(String visitHistory) {
        this.visitHistory = visitHistory == null ? null : visitHistory.trim();
    }

    public String getTreatResult() {
        return treatResult;
    }

    public void setTreatResult(String treatResult) {
        this.treatResult = treatResult == null ? null : treatResult.trim();
    }

    public String getRecomPathid() {
        return recomPathid;
    }

    public void setRecomPathid(String recomPathid) {
        this.recomPathid = recomPathid == null ? null : recomPathid.trim();
    }

    public String getZresult() {
        return zresult;
    }

    public void setZresult(String zresult) {
        this.zresult = zresult == null ? null : zresult.trim();
    }
}