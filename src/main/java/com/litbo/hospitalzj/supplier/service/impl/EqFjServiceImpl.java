package com.litbo.hospitalzj.supplier.service.impl;

import java.util.List;

import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.controller.ex.EqFjIsNullException;
import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.mapper.EqFjMapper;
import com.litbo.hospitalzj.supplier.service.EqFjService;

@Service
public class EqFjServiceImpl implements EqFjService{
	@Autowired
	private EqFjMapper eqFjMapper;

	@Override
	public EqFj insertEqFj(EqFj eqfj) {
		EqFj data=eqFjMapper.selectByName(eqfj.getEqFjmc());
		if(data!=null){
			throw new InsertException("设备附件已存在");
		}
		eqFjMapper.insertEqFj(eqfj);
		return eqfj;
	}

	@Override
	public void updateInfo(EqFj eqfj) {
		eqFjMapper.updataInfo(eqfj);
	}

	@Override
	public List<EqFj> selectInfo(Integer eqIds) {
		List<EqFj> data=eqFjMapper.selectEqFj(eqIds);
		if (data==null) {
			throw new EqFjIsNullException("设备附件信息不存在，需要请添加");
		}
		return data;
	}
}
