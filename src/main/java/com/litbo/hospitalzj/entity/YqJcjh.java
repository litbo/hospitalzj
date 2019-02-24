package com.litbo.hospitalzj.entity;

import java.util.Date;
/**
 * 检测计划表
 * @author 刘洋
 *
 */
public class YqJcjh {
	private Integer jcjhId;
	private String eqId;
	private Integer jcjhStatus;
	private Date creatTime;
	private Date wcTime;
	private String fbrId;
	private String shrId;
	public Integer getJcjhId() {
		return jcjhId;
	}
	public void setJcjhId(Integer jcjhId) {
		this.jcjhId = jcjhId;
	}
	public Integer getJcjhStatus() {
		return jcjhStatus;
	}
	public void setJcjhStatus(Integer jcjhStatus) {
		this.jcjhStatus = jcjhStatus;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Date getWcTime() {
		return wcTime;
	}
	public void setWcTime(Date wcTime) {
		this.wcTime = wcTime;
	}
	
	public String getEqId() {
		return eqId;
	}
	public void setEqId(String eqId) {
		this.eqId = eqId;
	}
	public String getFbrId() {
		return fbrId;
	}
	public void setFbrId(String fbrId) {
		this.fbrId = fbrId;
	}
	public String getShrId() {
		return shrId;
	}
	public void setShrId(String shrId) {
		this.shrId = shrId;
	}
	@Override
	public String toString() {
		return "yqjcjh [jcjhId=" + jcjhId + ", eqId=" + eqId + ", jcjhStatus=" + jcjhStatus + ", creatTime=" + creatTime
				+ ", wcTime=" + wcTime + ", fbrId=" + fbrId + ", shrId=" + shrId + "]";
	}
	
}
