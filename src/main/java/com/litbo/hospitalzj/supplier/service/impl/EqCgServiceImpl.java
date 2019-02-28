package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备来源业务层
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import com.litbo.hospitalzj.supplier.service.exception.UpdateException;
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

	@Override
	public void delete(String eqcgId) {
		EqCgfs data=eqCgMapper.findById(eqcgId);
		if(data==null){
			throw new DeleteException("采购方式不已存在");
		}
		eqCgMapper.delete(eqcgId);
	}

	@Override
	public void insert(EqCgfs eqCgfs) {
		EqCgfs data=eqCgMapper.findById(eqCgfs.getEqcgId());
		if(data!=null){
			throw new InsertException("采购方式或名称已存在");
		}
		eqCgMapper.insert(eqCgfs);
	}

	@Override
	public EqCgfs update(EqCgfs eqCgfs) {
		eqCgMapper.update(eqCgfs);
		return eqCgfs;
	}
}
