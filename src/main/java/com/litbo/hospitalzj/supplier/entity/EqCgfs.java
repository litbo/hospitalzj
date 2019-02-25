package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备采购方式
 * @author 刘洋
 *
 */
public class EqCgfs {
	private String eqcgId;
	private String eqcgName;
	public String getEqcgId() {
		return eqcgId;
	}
	public void setEqcgId(String eqcgId) {
		this.eqcgId = eqcgId;
	}
	public String getEqcgName() {
		return eqcgName;
	}
	public void setEqcgName(String eqcgName) {
		this.eqcgName = eqcgName;
	}
	@Override
	public String toString() {
		return "EqCgfs [eqcgId=" + eqcgId + ", eqcgName=" + eqcgName + "]";
	}
	
}
