package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备品名字典表
 * @author 刘洋
 *
 */
public class EqPm {
	private String eqPmId;
	private String eqPmName;
	public String getEqPmId() {
		return eqPmId;
	}
	public void setEqPmId(String eqPmId) {
		this.eqPmId = eqPmId;
	}
	public String getEqPmName() {
		return eqPmName;
	}
	public void setEqPmName(String eqPmName) {
		this.eqPmName = eqPmName;
	}
	@Override
	public String toString() {
		return "EqPm [eqPmId=" + eqPmId + ", eqPmName=" + eqPmName + "]";
	}
	
}
