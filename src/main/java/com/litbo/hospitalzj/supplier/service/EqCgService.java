package com.litbo.hospitalzj.supplier.service;
/**
 * 设备采购方式业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;

public interface EqCgService {

	EqCgfs getById(String eqcgId);

	List<EqCgfs> getAll();

	void delete(String eqcgId);

	void insert(EqCgfs eqCgfs);

	EqCgfs update(EqCgfs eqCgfs);
}
