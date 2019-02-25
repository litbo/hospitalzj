package com.litbo.hospitalzj.supplier.service;
/**
 * 设备用途业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqPm;

public interface EqPmService {
	/*
	 * 查找设备品名名称
	 */
	EqPm getById(String eqPmId);
	
	/*
	 * 查找所有品名来源
	 */
	List<EqPm> getAll();
}
