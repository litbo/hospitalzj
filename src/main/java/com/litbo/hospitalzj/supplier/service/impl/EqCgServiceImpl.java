package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备来源业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.mapper.EqCgMapper;
import com.litbo.hospitalzj.supplier.mapper.EqLyMapper;
import com.litbo.hospitalzj.supplier.service.EqCgService;
import com.litbo.hospitalzj.supplier.service.EqLyService;

@Service
public class EqCgServiceImpl implements EqCgService{
	@Autowired
	private EqCgMapper eqCgMapper;

	@Override
	public EqCgfs getById(String eqcgId) {
		return findById(eqcgId);
	}
	private EqCgfs findById(String eqcgId) {
		return eqCgMapper.findById(eqcgId);
	}
	@Override
	public List<EqCgfs> getAll() {
		return eqCgMapper.findAll();
	}
}
