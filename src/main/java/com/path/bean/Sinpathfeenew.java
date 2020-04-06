package com.path.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Sinpathfeenew {

    private Integer path_id;

    private String cname;

    private String hosp_exp;

    private String med_exp;
    
	private String drug_exp;

	public Integer getPath_id() {
		return path_id;
	}

	public void setPath_id(Integer path_id) {
		this.path_id = path_id;
	}

	public String getHosp_exp() {
		return hosp_exp;
	}

	public void setHosp_exp(String hosp_exp) {
		this.hosp_exp = hosp_exp;
	}

	public String getMed_exp() {
		return med_exp;
	}

	public void setMed_exp(String med_exp) {
		this.med_exp = med_exp;
	}

	public String getDrug_exp() {
		return drug_exp;
	}

	public void setDrug_exp(String drug_exp) {
		this.drug_exp = drug_exp;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}