package com.litbo.hospitalzj.supplier.service.impl;

import com.litbo.hospitalzj.supplier.controller.ex.EqInfoIsNullException;
import com.litbo.hospitalzj.supplier.controller.ex.HtInfoIsNullException;
import com.litbo.hospitalzj.supplier.entity.HtLc;
import com.litbo.hospitalzj.supplier.mapper.HtLcMapper;
import com.litbo.hospitalzj.supplier.service.HtLcService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 合同流程业务层
 * @author 刘洋
 *
 */
@Service

public class HtLcServiceImpl implements HtLcService {
	@Autowired
	private  HtLcMapper htLcMapper;

	@Override
	public void InsertHtLc(Integer  htId , String htCldz,  Date htClsj) {
		htLcMapper.insertEqlc(htId,htCldz, htClsj);
	}

	@Override
	public void DeleteLc(Integer lcId) {
		htLcMapper.delete(lcId);
	}

	@Override
	public HtLc Select(Integer htId) {
		HtLc data=htLcMapper.select(htId);
		if(data==null){
			throw new HtInfoIsNullException("合同信息不存在");
		}
		return data;
	}
}
