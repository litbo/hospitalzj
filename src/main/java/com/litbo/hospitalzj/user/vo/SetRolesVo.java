package com.litbo.hospitalzj.user.vo;

import java.util.ArrayList;

public class SetRolesVo {

	private String roleId;
    private ArrayList<String> userIds;
	public ArrayList<String> getUserIds() {
		return userIds;
	}
	public void setUserIds(ArrayList<String> userIds) {
		this.userIds = userIds;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
    
}