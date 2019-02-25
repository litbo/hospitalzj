package com.litbo.hospitalzj.supplier.service;
/**
 * 设备用途业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqYt;

public interface EqYtService {
	/*
	 * 查找设备来源名称
	 */
	EqYt getById(String eqytId);
	
	/*
	 * 查找所有设备来源
	 */
	List<EqYt> getAll();
}
