package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备来源业务层
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.service.exception.InsertException;
import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
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

	@Override
	public void delete(String eqlyId) {
		EqLy data=findById(eqlyId);
		if(data==null){
			throw new DeleteException("设备来源不存在");
		}
		eqLyMapper.delete(eqlyId);
	}

	@Override
	public void insert(EqLy eqLy) {
		EqLy data=eqLyMapper.findById(eqLy.getEqlyId());
		if(data!=null){
			throw new InsertException("设备来源号或名称已存在");
		}
		eqLyMapper.insert(eqLy);
	}

	@Override
	public EqLy update(EqLy eqLy) {
		eqLyMapper.update(eqLy);
		return eqLy;
	}
}
