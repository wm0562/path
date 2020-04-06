package com.path.bean;

public class Pathcount {
    private Integer countId;
    
    private Integer pathId;

    private Integer pid;

    private String hospFee;

    private String pathFee;

    private String departFee;


	public Integer getPathId() {
		return pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getDepartFee() {
		return departFee;
	}

	public void setDepartFee(String departFee) {
		this.departFee = departFee == null ? null : departFee.trim();
	}

	public String getPathFee() {
		return pathFee;
	}

	public void setPathFee(String pathFee) {
		this.pathFee = pathFee == null ? null : pathFee.trim();
	}

	public String getHospFee() {
		return hospFee;
	}

	public void setHospFee(String hospFee) {
		this.hospFee = hospFee == null ? null : hospFee.trim();
	}

	public Integer getCountId() {
		return countId;
	}

	public void setCountId(Integer countId) {
		this.countId = countId;
	}
}