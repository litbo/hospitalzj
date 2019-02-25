package com.litbo.hospitalzj.supplier.service;
/**
 * 设备经费业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqJfly;

public interface EqJfService {
	/*
	 * 查找设备来源名称
	 */
	EqJfly getById(String eqjfId);
	
	/*
	 * 查找所有设备来源
	 */
	List<EqJfly> getAll();
}
