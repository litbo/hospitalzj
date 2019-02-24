package com.litbo.hospitalzj.entity;
/**
 * 人员分配仪器表
 * @author 刘洋
 *
 */
public class YqRole {
	private Integer id;
	private String userId;
	private Integer roleStatus;
	private String eqId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(Integer roleStatus) {
		this.roleStatus = roleStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEqId() {
		return eqId;
	}
	public void setEqId(String eqId) {
		this.eqId = eqId;
	}
	@Override
	public String toString() {
		return "yqrole [id=" + id + ", userId=" + userId + ", roleStatus=" + roleStatus + ", eqId=" + eqId + "]";
	}
	

	
}
