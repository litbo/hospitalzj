package com.litbo.hospitalzj.supplier.service;

import com.litbo.hospitalzj.supplier.entity.SgdjHw;

public interface SgdjHwService {
	SgdjHw selectSgdjHw(Integer htIds);
	Integer InsertSgdjHw(SgdjHw sgdjHw);
	Integer updateInfo(SgdjHw sgdjHw);
	/*Integer */
}