package com.litbo.hospitalzj.supplier.service;
/**
 * 设备来源业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqJfly;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import org.apache.ibatis.annotations.Insert;

public interface EqLyService {

	EqLy getById(String eqlyId);
	

	List<EqLy> getAll();

	void delete(String eqlyId);

	void insert(EqLy eqLy);
	EqLy update(EqLy eqLy);
}
