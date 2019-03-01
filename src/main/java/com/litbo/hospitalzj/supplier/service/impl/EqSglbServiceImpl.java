package com.litbo.hospitalzj.supplier.service.impl;
/**
 * 申购类别业务层
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
import com.litbo.hospitalzj.supplier.service.exception.InsertException;
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

	@Override
	public void delete(String eqsgId) {
		EqSglb data=eqSglbMapper.findById(eqsgId);
		if(data==null){
			throw new DeleteException("设备申购来源不存在");
		}
		eqSglbMapper.delete(eqsgId);
	}

	@Override
	public void insert(EqSglb eqSglb) {
		EqSglb data=eqSglbMapper.findById(eqSglb.getEqsgId());
		if(data!=null){
			throw new InsertException("设备申购来源或名称已存在");
		}
		eqSglbMapper.insert(eqSglb);
	}
	@Override
	public EqSglb update(EqSglb eqSglb) {
		eqSglbMapper.update(eqSglb);
		return eqSglb;
	}
}
