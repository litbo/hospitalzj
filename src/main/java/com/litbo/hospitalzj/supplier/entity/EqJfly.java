package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备经费来源
 * @author 刘洋
 *
 */
public class EqJfly {
	private String eqjfId;
	private String eqjfName;
	public String getEqjfId() {
		return eqjfId;
	}
	public void setEqjfId(String eqjfId) {
		this.eqjfId = eqjfId;
	}
	public String getEqjfName() {
		return eqjfName;
	}
	public void setEqjfName(String eqjfName) {
		this.eqjfName = eqjfName;
	}
	@Override
	public String toString() {
		return "EqJfly [eqjfId=" + eqjfId + ", eqjfName=" + eqjfName + "]";
	}
	
}
