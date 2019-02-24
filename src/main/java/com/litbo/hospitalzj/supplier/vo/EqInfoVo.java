package com.litbo.hospitalzj.supplier.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqFj;

/**
 * 设备信息实体类
 * @author 刘洋
 *
 */
public class EqInfoVo {

	private Integer eqId;
	private Integer htIds;
	private String eqPm;
	private String eqGg;
	private String  eqXh;
	private String eqJldwId;
	private BigDecimal eqPrice;
	private String eqZczbh;
	private String eqScbh;
	private String eqNum;
	private String eqTotalprice;
	private String eqCcdate;
	private String eqCscs;
	private String eqGb;
	private String eqBgbh;
	private String eqShFws;
	private String eqShShjl;
	private String eqShQddh;
	private String eqShJldh;
	private String eqShFwr;
	private String eqShLxr;
	private String eqShLxrdh;
	private Integer eqState;
	private String eqYzm;
	private String  eqShJlsb;
	private String  eqShFssb;
	private List<EqFj> eqFjs;
	
	public List<EqFj> getEqFjs() {
		return eqFjs;
	}
	public void setEqFjs(List<EqFj> eqFjs) {
		this.eqFjs = eqFjs;
	}
	public String getEqShJlsb() {
		return eqShJlsb;
	}
	public void setEqShJlsb(String eqShJlsb) {
		this.eqShJlsb = eqShJlsb;
	}
	public String getEqShFssb() {
		return eqShFssb;
	}
	public void setEqShFssb(String eqShFssb) {
		this.eqShFssb = eqShFssb;
	}
	public String getEqShLxr() {
		return eqShLxr;
	}
	public void setEqShLxr(String eqShLxr) {
		this.eqShLxr = eqShLxr;
	}
	public Integer getHtIds() {
		return htIds;
	}
	public void setHtIds(Integer htIds) {
		this.htIds = htIds;
	}
	public Integer getEqState() {
		return eqState;
	}
	public void setEqState(Integer eqState) {
		this.eqState = eqState;
	}
	public String getEqYzm() {
		return eqYzm;
	}
	public void setEqYzm(String eqYzm) {
		this.eqYzm = eqYzm;
	}
	public Integer getEqId() {
		return eqId;
	}
	public void setEqId(Integer eqId) {
		this.eqId = eqId;
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
	public String getEqJldwId() {
		return eqJldwId;
	}
	public void setEqJldwId(String eqJldwId) {
		this.eqJldwId = eqJldwId;
	}
	public BigDecimal getEqPrice() {
		return eqPrice;
	}
	public void setEqPrice(BigDecimal eqPrice) {
		this.eqPrice = eqPrice;
	}
	public String getEqZczbh() {
		return eqZczbh;
	}
	public void setEqZczbh(String eqZczbh) {
		this.eqZczbh = eqZczbh;
	}
	public String getEqScbh() {
		return eqScbh;
	}
	public void setEqScbh(String eqScbh) {
		this.eqScbh = eqScbh;
	}
	public String getEqNum() {
		return eqNum;
	}
	public void setEqNum(String eqNum) {
		this.eqNum = eqNum;
	}
	public String getEqTotalprice() {
		return eqTotalprice;
	}
	public void setEqTotalprice(String eqTotalprice) {
		this.eqTotalprice = eqTotalprice;
	}
	public String getEqCcdate() {
		return eqCcdate;
	}
	public void setEqCcdate(String eqCcdate) {
		this.eqCcdate = eqCcdate;
	}
	public String getEqCscs() {
		return eqCscs;
	}
	public void setEqCscs(String eqCscs) {
		this.eqCscs = eqCscs;
	}
	public String getEqGb() {
		return eqGb;
	}
	public void setEqGb(String eqGb) {
		this.eqGb = eqGb;
	}
	public String getEqBgbh() {
		return eqBgbh;
	}
	public void setEqBgbh(String eqBgbh) {
		this.eqBgbh = eqBgbh;
	}
	public String getEqShFws() {
		return eqShFws;
	}
	public void setEqShFws(String eqShFws) {
		this.eqShFws = eqShFws;
	}
	public String getEqShShjl() {
		return eqShShjl;
	}
	public void setEqShShjl(String eqShShjl) {
		this.eqShShjl = eqShShjl;
	}
	public String getEqShQddh() {
		return eqShQddh;
	}
	public void setEqShQddh(String eqShQddh) {
		this.eqShQddh = eqShQddh;
	}
	public String getEqShJldh() {
		return eqShJldh;
	}
	public void setEqShJldh(String eqShJldh) {
		this.eqShJldh = eqShJldh;
	}
	public String getEqShFwr() {
		return eqShFwr;
	}
	public void setEqShFwr(String eqShFwr) {
		this.eqShFwr = eqShFwr;
	}

	@Override
	public String toString() {
		return "EqInfoVo [eqId=" + eqId + ", htIds=" + htIds + ", eqPm=" + eqPm + ", eqGg=" + eqGg + ", eqXh=" + eqXh
				+ ", eqJldwId=" + eqJldwId + ", eqPrice=" + eqPrice + ", eqZczbh=" + eqZczbh + ", eqScbh=" + eqScbh
				+ ", eqNum=" + eqNum + ", eqTotalprice=" + eqTotalprice + ", eqCcdate=" + eqCcdate + ", eqCscs="
				+ eqCscs + ", eqGb=" + eqGb + ", eqBgbh=" + eqBgbh + ", eqShFws=" + eqShFws + ", eqShShjl=" + eqShShjl
				+ ", eqShQddh=" + eqShQddh + ", eqShJldh=" + eqShJldh + ", eqShFwr=" + eqShFwr + ", eqShLxr=" + eqShLxr
				+ ", eqShLxrdh=" + eqShLxrdh + ", eqState=" + eqState + ", eqYzm=" + eqYzm + ", eqShJlsb=" + eqShJlsb
				+ ", eqShFssb=" + eqShFssb + ", eqFjs=" + eqFjs + "]";
	}
	public void setEqShLxrdh(String eqShLxrdh) {
		this.eqShLxrdh = eqShLxrdh;
	}
	
	
}