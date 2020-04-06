package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Pathvariation {
    private Integer variationId;

    private Integer chujId;

    private String vPath;

    private String flag;
    
    private String variationRecorde;
    
    private String feedback;
    
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date ctime;

    private String man;

    public Integer getVariationId() {
        return variationId;
    }

    public void setVariationId(Integer variationId) {
        this.variationId = variationId;
    }

    public String getVariationRecorde() {
        return variationRecorde;
    }

    public void setVariationRecorde(String variationRecorde) {
        this.variationRecorde = variationRecorde == null ? null : variationRecorde.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man == null ? null : man.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getChujId() {
		return chujId;
	}

	public void setChujId(Integer chujId) {
		this.chujId = chujId;
	}

	public String getvPath() {
		return vPath;
	}

	public void setvPath(String vPath) {
		this.vPath = vPath == null ? null : vPath.trim();
	}
}