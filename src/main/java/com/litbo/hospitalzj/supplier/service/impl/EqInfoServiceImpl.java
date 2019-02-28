package com.litbo.hospitalzj.supplier.service.impl;

import java.util.List;

import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.controller.ex.EqInfoIsNullException;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.mapper.EqInfoMapper;
import com.litbo.hospitalzj.supplier.service.EqInfoService;
import com.litbo.hospitalzj.supplier.vo.SelHtEqVo;

@Service
public class EqInfoServiceImpl implements EqInfoService {
	@Autowired
	public EqInfoMapper eqInfoMapper;
	@Override
	public Integer InsertEqInfo(EqInfo eqInfo) {
		EqInfo data=eqInfoMapper.selectByName(eqInfo.getEqMc());
		if(data!=null){
			throw new InsertException("设备信息已存在");
		}
		eqInfoMapper.insertEqInfo(eqInfo);
		return eqInfo.getEqId();
	}
	@Override
	public void updateInfo(EqInfo eqInfo) {
		eqInfoMapper.updateInfo(eqInfo);
	}
	@Override
	public List<EqInfo> selectEqInfo(Integer htIds) {
		List<EqInfo> data=eqInfoMapper.selectEqinfo(htIds);
		if(data==null) {
			throw new EqInfoIsNullException("设备信息为空，需要请添加");
		}
		return data;
	}
	@Override
	public List<SelHtEqVo> selectEqHtVo(Integer htIds) {
		List<SelHtEqVo> data=eqInfoMapper.selectEqHtVo(htIds);
		if(data==null) {
			throw new EqInfoIsNullException("设备信息为空，需要请添加");
		}
		return data;
	}
	@Override
	public Integer findHtId(Integer eqId) {
		Integer data=eqInfoMapper.selectHtId(eqId);
		if(data==null) {
			throw new EqInfoIsNullException("设备信息为空，需要请添加");
		}
		return data;
	};
}
