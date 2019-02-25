package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备品名业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqPm;
import com.litbo.hospitalzj.supplier.mapper.EqPmMapper;
import com.litbo.hospitalzj.supplier.service.EqPmService;

@Service
public class EqPmServiceImpl implements EqPmService{
	@Autowired
	private EqPmMapper eqPmMapper;

	@Override
	public EqPm getById(String eqPmId) {
		return findById(eqPmId);
	}
	private EqPm findById(String eqPmId) {
		return eqPmMapper.findById(eqPmId);
	}
	@Override
	public List<EqPm> getAll() {
		return eqPmMapper.findAll();
	}
}
