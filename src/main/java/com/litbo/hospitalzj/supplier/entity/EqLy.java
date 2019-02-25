package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备来源数据
 * @author 刘洋
 *
 */
public class EqLy {
	private String eqlyId;
	private String eqlyName;
	public String getEqlyId() {
		return eqlyId;
	}
	public void setEqlyId(String eqlyId) {
		this.eqlyId = eqlyId;
	}
	public String getEqlyName() {
		return eqlyName;
	}
	public void setEqlyName(String eqlyName) {
		this.eqlyName = eqlyName;
	}
	@Override
	public String toString() {
		return "EqLy [eqlyId=" + eqlyId + ", eqlyName=" + eqlyName + "]";
	}
	
}
