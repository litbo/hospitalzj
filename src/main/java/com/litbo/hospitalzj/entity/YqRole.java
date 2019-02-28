package com.litbo.hospitalzj.entity;
/**
 * 人员分配仪器表
 * @author 刘洋
 *
 */
public class YqRole {
	private Integer id;
	private Integer userId;
	private Integer roleStatus;
	private Integer eqId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(Integer roleStatus) {
		this.roleStatus = roleStatus;
	}

	public Integer getEqId() {
		return eqId;
	}

	public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
}
