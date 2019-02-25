package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备用途业务层
 * @author 刘洋
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqYt;
import com.litbo.hospitalzj.supplier.mapper.EqYtMapper;
import com.litbo.hospitalzj.supplier.service.EqYtService;

@Service
public class EqYtServiceImpl implements EqYtService{
	@Autowired
	private EqYtMapper eqYtMapper;

	@Override
	public EqYt getById(String eqytId) {
		return findById(eqytId);
	}
	private EqYt findById(String eqytId) {
		return eqYtMapper.findById(eqytId);
	}
	@Override
	public List<EqYt> getAll() {
		return eqYtMapper.findAll();
	}
}
