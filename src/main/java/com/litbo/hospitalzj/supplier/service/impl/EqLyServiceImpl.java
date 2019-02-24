package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备来源业务层
 * @author 刘洋
 *
 */

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
	public EqLy getByCode(String eqLycode) {
		return findByCode(eqLycode);
	}
	private EqLy findByCode(String eqLycode) {
		return eqLyMapper.findByCode(eqLycode);
	}
}
