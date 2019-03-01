package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 设备品名业务层
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
import com.litbo.hospitalzj.supplier.service.exception.InsertException;
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

	@Override
	public void delete(String eqPmId) {
		EqPm data=findById(eqPmId);
		if(data==null){
			throw new DeleteException("设备品名不存在");
		}
		eqPmMapper.delete(eqPmId);
	}

	@Override
	public void insert(EqPm eqPm) {
		System.out.println(eqPm);
		EqPm data=findById(eqPm.getEqPmId());
		if(data!=null){
			throw new InsertException("设备品名或名称已存在");
		}
		eqPmMapper.insert(eqPm);
	}

	@Override
	public EqPm update(EqPm eqPm) {
		eqPmMapper.update(eqPm);
		return eqPm;
	}
}
