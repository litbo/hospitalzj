package com.litbo.hospitalzj.vo;



import java.util.ArrayList;


public class SetRolesVo {

    private ArrayList<String> userIds;
    private String roleId;
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