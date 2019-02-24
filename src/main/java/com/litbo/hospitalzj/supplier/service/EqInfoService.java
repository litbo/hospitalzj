package com.litbo.hospitalzj.supplier.service;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.vo.SelHtEqVo;

public interface EqInfoService {
	Integer InsertEqInfo(EqInfo eqInfo);
	
	Integer findHtId(Integer eqId);
	
	void updateInfo(EqInfo eqInfo);
	
	List<EqInfo> selectEqInfo(Integer htIds);
	
	List<SelHtEqVo> selectEqHtVo(Integer htIds);
}
