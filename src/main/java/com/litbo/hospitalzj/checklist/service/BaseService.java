package com.litbo.hospitalzj.checklist.service;

import com.litbo.hospitalzj.checklist.dao.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 公共Service层
 * @author bigStone
 *
 */
@Service("baseService")
public class BaseService {

	@Autowired
	private BaseMapper baseMapper;

	/*
	 *以设备品名Id查询对应的表格 
	 */
	public String findTableName(String eqId) {
		return baseMapper.findTableName(eqId);
	}
	
	
	
	
	
	
	
	
	
	
	
}
