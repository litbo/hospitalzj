package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备来源数据
 * @author 刘洋
 *
 */
public class EqLy {
	private String eqlyCode;
	private String eqlyName;
	public String getEqlyCode() {
		return eqlyCode;
	}
	public void setEqlyCode(String eqlyCode) {
		this.eqlyCode = eqlyCode;
	}
	public String getEqlyName() {
		return eqlyName;
	}
	public void setEqlyName(String eqlyName) {
		this.eqlyName = eqlyName;
	}
	@Override
	public String toString() {
		return "EqLy [eqlyCode=" + eqlyCode + ", eqlyName=" + eqlyName + "]";
	}
	
	
}
