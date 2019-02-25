package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备申购类别
 * @author 刘洋
 *
 */
public class EqSglb {
	private String eqsgId;
	private String eqsgName;
	public String getEqsgId() {
		return eqsgId;
	}
	public void setEqsgId(String eqsgId) {
		this.eqsgId = eqsgId;
	}
	public String getEqsgName() {
		return eqsgName;
	}
	public void setEqsgName(String eqsgName) {
		this.eqsgName = eqsgName;
	}
	@Override
	public String toString() {
		return "EqSglb [eqsgId=" + eqsgId + ", eqsgName=" + eqsgName + "]";
	}
	
}
