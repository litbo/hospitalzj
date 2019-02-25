package com.litbo.hospitalzj.supplier.service;
/**
 * 设备来源业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqLy;

public interface EqLyService {
	/*
	 * 查找设备来源名称
	 */
	EqLy getById(String eqlyId);
	
	/*
	 * 查找所有设备来源
	 */
	List<EqLy> getAll();
}
