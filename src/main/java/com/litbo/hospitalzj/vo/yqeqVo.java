package com.litbo.hospitalzj.vo;

public class yqeqVo {
	 private Integer id;
	 private String yqId;
	 private String eqId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getYqId() {
		return yqId;
	}
	public void setYqId(String yqId) {
		this.yqId = yqId;
	}
	public String getEqId() {
		return eqId;
	}
	public void setEqId(String eqId) {
		this.eqId = eqId;
	}
	@Override
	public String toString() {
		return "yqeqVo [id=" + id + ", yqId=" + yqId + ", eqId=" + eqId + "]";
	}
	
	
	 
}
