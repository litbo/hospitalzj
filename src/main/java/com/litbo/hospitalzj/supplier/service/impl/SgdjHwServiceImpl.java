package com.litbo.hospitalzj.supplier.service.impl;

import com.litbo.hospitalzj.hospital.enums.EnumProcess;
import com.litbo.hospitalzj.supplier.mapper.HtInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.controller.ex.SgdjHwIsNullException;
import com.litbo.hospitalzj.supplier.entity.SgdjHw;
import com.litbo.hospitalzj.supplier.mapper.SgdjHwMapper;
import com.litbo.hospitalzj.supplier.service.SgdjHwService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SgdjHwServiceImpl implements SgdjHwService{
	@Autowired
	private SgdjHwMapper SgdjHwMapper;
	@Autowired
	private HtInfoMapper htInfoMapper;
	@Override
	public SgdjHw selectSgdjHw(Integer htIds) {
		SgdjHw data=SgdjHwMapper.selectSgdjHw(htIds);
		if(data==null) {
			throw new SgdjHwIsNullException("到货登记为空");
		}
		return data;
	}

	@Override
	@Transactional
	public Integer InsertSgdjHw(SgdjHw sgdjhw) {
		htInfoMapper.updateStateById(sgdjhw.getHtIds(),EnumProcess.PERFECT_INFORMATION.getCode());
		return SgdjHwMapper.insertSgdjHw(sgdjhw);
	}

	@Override
	public Integer updateInfo(SgdjHw sgdjhw) {
		return SgdjHwMapper.updateInfo(sgdjhw);
	}

}
