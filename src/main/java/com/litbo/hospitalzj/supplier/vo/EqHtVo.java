package com.litbo.hospitalzj.supplier.vo;

import java.util.Date;
import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.entity.HtInfo;


/**
 * 
 * @author 刘洋
 *
 */
public class EqHtVo {
	private Integer htIds;
	private String htHthao;
	private String eqPm;
	private String eqGg;
	private String eqXh;
	private Date htQytime;
	private Integer htState;
	private String htYzm;
	
	public Integer getHtIds() {
		return htIds;
	}
	public void setHtIds(Integer htIds) {
		this.htIds = htIds;
	}
	public String getHtHthao() {
		return htHthao;
	}
	public void setHtHthao(String htHthao) {
		this.htHthao = htHthao;
	}
	public String getEqPm() {
		return eqPm;
	}
	public void setEqPm(String eqPm) {
		this.eqPm = eqPm;
	}
	public String getEqGg() {
		return eqGg;
	}
	public void setEqGg(String eqGg) {
		this.eqGg = eqGg;
	}
	public String getEqXh() {
		return eqXh;
	}
	public void setEqXh(String eqXh) {
		this.eqXh = eqXh;
	}
	public Date getHtQytime() {
		return htQytime;
	}
	public void setHtQytime(Date htQytime) {
		this.htQytime = htQytime;
	}
	public Integer getHtState() {
		return htState;
	}
	public void setHtState(Integer htState) {
		this.htState = htState;
	}
	public String getHtYzm() {
		return htYzm;
	}
	public void setHtYzm(String htYzm) {
		this.htYzm = htYzm;
	}
	@Override
	public String toString() {
		return "EqHtFjVo [htIds=" + htIds + ", htHthao=" + htHthao + ", eqPm=" + eqPm + ", eqGg=" + eqGg + ", eqXh="
				+ eqXh + ", htQytime=" + htQytime + ", htState=" + htState + ", htYzm=" + htYzm + "]";
	}
	
	
}
