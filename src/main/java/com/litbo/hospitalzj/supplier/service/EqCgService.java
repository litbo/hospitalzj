package com.litbo.hospitalzj.supplier.service;
/**
 * 设备采购方式业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;

public interface EqCgService {
	/*
	 * 查找设备来源名称
	 */
	EqCgfs getById(String eqcgId);
	
	/*
	 * 查找所有设备来源
	 */
	List<EqCgfs> getAll();
}
