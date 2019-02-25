package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备来源业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.mapper.EqLyMapper;
import com.litbo.hospitalzj.supplier.service.EqLyService;

@Service
public class EqLyServiceImpl implements EqLyService{
	@Autowired
	private EqLyMapper eqLyMapper;

	@Override
	public EqLy getById(String eqlyId) {
		return findById(eqlyId);
	}
	private EqLy findById(String eqlyId) {
		return eqLyMapper.findById(eqlyId);
	}
	@Override
	public List<EqLy> getAll() {
		return eqLyMapper.findAll();
	}
}
