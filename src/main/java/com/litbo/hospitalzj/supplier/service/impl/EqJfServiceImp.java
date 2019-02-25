package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备经费业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqJfly;
import com.litbo.hospitalzj.supplier.mapper.EqJfMapper;
import com.litbo.hospitalzj.supplier.service.EqJfService;

@Service
public class EqJfServiceImp implements EqJfService{
	@Autowired
	private EqJfMapper eqJflyMapper;

	@Override
	public EqJfly getById(String eqjfId) {
		return findById(eqjfId);
	}
	private EqJfly findById(String eqjfId) {
		return eqJflyMapper.findById(eqjfId);
	}
	@Override
	public List<EqJfly> getAll() {
		return eqJflyMapper.findAll();
	}
}
