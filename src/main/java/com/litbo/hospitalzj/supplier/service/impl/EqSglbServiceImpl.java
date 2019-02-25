package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 申购类别业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
import com.litbo.hospitalzj.supplier.mapper.EqSglbMapper;
import com.litbo.hospitalzj.supplier.service.EqSglbService;

@Service
public class EqSglbServiceImpl implements EqSglbService{
	@Autowired
	private EqSglbMapper eqSglbMapper;

	@Override
	public EqSglb getById(String eqsgId) {
		return findById(eqsgId);
	}
	private EqSglb findById(String eqsgId) {
		return eqSglbMapper.findById(eqsgId);
	}
	@Override
	public List<EqSglb> getAll() {
		return eqSglbMapper.findAll();
	}
}
