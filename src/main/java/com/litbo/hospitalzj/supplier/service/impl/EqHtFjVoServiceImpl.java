package com.litbo.hospitalzj.supplier.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.mapper.EqFjMapper;
import com.litbo.hospitalzj.supplier.mapper.EqHtFjVoMapper;
import com.litbo.hospitalzj.supplier.mapper.EqInfoMapper;
import com.litbo.hospitalzj.supplier.mapper.HtInfoMapper;
import com.litbo.hospitalzj.supplier.service.EqHtFjVoService;
import com.litbo.hospitalzj.supplier.vo.EqHtFjVo;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;
import com.litbo.hospitalzj.supplier.vo.EqInfoVo;
import com.litbo.hospitalzj.supplier.vo.InsertEqHtFiVo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class EqHtFjVoServiceImpl implements EqHtFjVoService {

	@Autowired
	private EqHtFjVoMapper eqHtFjVoMapper;
	@Autowired
	private EqInfoMapper eqInfoMapper;
	@Autowired
	private EqFjMapper eqfjMapper;
	@Autowired
	private HtInfoMapper htInfoMapper;
	@Override
	public List<EqHtFjVo> findEqHtFjVo(String htYzm) {
		return eqHtFjVoMapper.eqHtFjVo(htYzm);
	}
	/*@Override
	public int insert(InsertEqHtFiVo insertEqHtFiVo) {
		HtInfo htInfo = insertEqHtFiVo.getHtinfo();
		htInfoMapper.insertHt(htInfo);

		return 0;

	}*/
	@Override
	public int insert(InsertEqHtFiVo insertEqHtFiVo) {
		HtInfo htInfo = insertEqHtFiVo.getHtinfo();
		htInfoMapper.insertHt(htInfo);
		List<EqInfoVo> eqInfoVos=insertEqHtFiVo.getEqInfoVos();
		for (EqInfoVo eqInfoVo : eqInfoVos) {
			eqInfoVo.setHtIds(htInfo.getHtId());
			EqInfo eqInfo = new EqInfo();
			BeanUtils.copyProperties(eqInfoVo,eqInfo);

			eqInfoMapper.insertEqInfo(eqInfo);
			List<EqFj> eqFjs =  eqInfoVo.getEqFjs();
			for (EqFj eqFj : eqFjs) {
				eqFj.setEqIds(eqInfo.getEqId());
			}
			eqfjMapper.insertCollectList(eqFjs);
		}
		return 1;
	}
}
