package com.litbo.hospitalzj.supplier.service;
/**
 * 设备来源业务层接口
 * @author 刘洋
 *
 */

import com.litbo.hospitalzj.supplier.entity.EqLy;

public interface EqLyService {
	/*
	 * 查找设备乱名称
	 */
	EqLy getByCode(String eqLycode);
}
