package com.litbo.hospitalzj.supplier.service;
/**
 * 设备经费业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqJfly;

public interface EqJfService {

	EqJfly getById(String eqjfId);

	List<EqJfly> getAll();

	void delete(String eqjfId);

	void insert(EqJfly eqJfly);
	EqJfly update(EqJfly eqJfly);
}
