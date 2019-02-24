package com.litbo.hospitalzj.entity;

import java.util.Date;
/**
 * 仪器检测模板表
 * @author 刘洋
 *
 */
public class YqMould {
	private Integer mbId;
	private String data;
	private Date createTime;
	private Integer mbStatus;
	private String mbName;
	public Integer getMbId() {
		return mbId;
	}
	public void setMbId(Integer mbId) {
		this.mbId = mbId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getMbStatus() {
		return mbStatus;
	}
	public void setMbStatus(Integer mbStatus) {
		this.mbStatus = mbStatus;
	}
	public String getMbName() {
		return mbName;
	}
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	@Override
	public String toString() {
		return "yqmould [mbId=" + mbId + ", data=" + data + ", createTime=" + createTime + ", mbStatus=" + mbStatus
				+ ", mbName=" + mbName + "]";
	}
}
