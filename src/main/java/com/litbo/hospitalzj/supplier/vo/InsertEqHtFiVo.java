package com.litbo.hospitalzj.supplier.vo;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.entity.HtInfo;

public class InsertEqHtFiVo {
	private HtInfo htinfo;
	private List<EqInfoVo> eqInfoVos;//shebdei 
	public HtInfo getHtinfo() {
		return htinfo;
	}
	public void setHtinfo(HtInfo htinfo) {
		this.htinfo = htinfo;
	}
	public List<EqInfoVo> getEqInfoVos() {
		return eqInfoVos;
	}
	public void setEqInfoVos(List<EqInfoVo> eqInfoVos) {
		this.eqInfoVos = eqInfoVos;
	}

	
}
