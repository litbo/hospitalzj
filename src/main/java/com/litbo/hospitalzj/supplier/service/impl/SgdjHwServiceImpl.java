package com.litbo.hospitalzj.supplier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.controller.ex.SgdjHwIsNullException;
import com.litbo.hospitalzj.supplier.entity.SgdjHw;
import com.litbo.hospitalzj.supplier.mapper.SgdjHwMapper;
import com.litbo.hospitalzj.supplier.service.SgdjHwService;
@Service
public class SgdjHwServiceImpl implements SgdjHwService{
	@Autowired
	private SgdjHwMapper SgdjHwMapper;
	@Override
	public SgdjHw selectSgdjHw(Integer htIds) {
		SgdjHw data=SgdjHwMapper.selectSgdjHw(htIds);
		if(data==null) {
			throw new SgdjHwIsNullException("到货登记为空");
		}
		return data;
	}

	@Override
	public Integer InsertSgdjHw(SgdjHw sgdjhw) {
		return SgdjHwMapper.insertSgdjHw(sgdjhw);
	}

	@Override
	public Integer updateInfo(SgdjHw sgdjhw) {
		return SgdjHwMapper.updateInfo(sgdjhw);
	}

}
