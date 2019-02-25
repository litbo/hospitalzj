package com.litbo.hospitalzj.supplier.entity;
/**
 * 设备用途
 * @author 刘洋
 *
 */
public class EqYt {
	private String eqytId;
	private String eqytName;
	public String getEqytId() {
		return eqytId;
	}
	public void setEqytId(String eqytId) {
		this.eqytId = eqytId;
	}
	public String getEqytName() {
		return eqytName;
	}
	public void setEqytName(String eqytName) {
		this.eqytName = eqytName;
	}
	@Override
	public String toString() {
		return "EqYt [eqytId=" + eqytId + ", eqytName=" + eqytName + "]";
	}
	
}
