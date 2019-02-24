package com.litbo.hospitalzj.entity;

import java.util.Date;

public class YqJcbb {
	private Integer jcbbId;
	private String data; 
	private Date jcbbCreateTime;
	private String jcyqId;
	private String eqId;
	private String jcbbJcrId;
	private String jcbbShrId;
	private Integer jcbbShStatus;
	private Integer jcjhId;
	public Integer getJcbbId() {
		return jcbbId;
	}
	public void setJcbbId(Integer jcbbId) {
		this.jcbbId = jcbbId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getJcbbCreateTime() {
		return jcbbCreateTime;
	}
	public void setJcbbCreateTime(Date jcbbCreateTime) {
		this.jcbbCreateTime = jcbbCreateTime;
	}
	public String getJcyqId() {
		return jcyqId;
	}
	public void setJcyqId(String jcyqId) {
		this.jcyqId = jcyqId;
	}
	public String getEqId() {
		return eqId;
	}
	public void setEqId(String eqId) {
		this.eqId = eqId;
	}
	public String getJcbbJcrId() {
		return jcbbJcrId;
	}
	public void setJcbbJcrId(String jcbbJcrId) {
		this.jcbbJcrId = jcbbJcrId;
	}
	public String getJcbbShrId() {
		return jcbbShrId;
	}
	public void setJcbbShrId(String jcbbShrId) {
		this.jcbbShrId = jcbbShrId;
	}
	
	public Integer getJcbbShStatus() {
		return jcbbShStatus;
	}
	public void setJcbbShStatus(Integer jcbbShStatus) {
		this.jcbbShStatus = jcbbShStatus;
	}
	public Integer getJcjhId() {
		return jcjhId;
	}
	public void setJcjhId(Integer jcjhId) {
		this.jcjhId = jcjhId;
	}
	@Override
	public String toString() {
		return "yqjcbb [jcbbId=" + jcbbId + ", data=" + data + ", jcbbCreateTime=" + jcbbCreateTime + ", jcyqId="
				+ jcyqId + ", eqId=" + eqId + ", jcbbJcrId=" + jcbbJcrId + ", jcbbShrId=" + jcbbShrId
				+ ", jcbbShStatus=" + jcbbShStatus + ", jcjhId=" + jcjhId + "]";
	}
}
