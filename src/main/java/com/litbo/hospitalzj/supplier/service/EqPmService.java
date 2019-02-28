package com.litbo.hospitalzj.supplier.service;
/**
 * 设备用途业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.entity.EqPm;
import org.apache.ibatis.annotations.Insert;

public interface EqPmService {

	EqPm getById(String eqPmId);
	

	List<EqPm> getAll();

	void delete(String eqPmId);


	void insert(EqPm eqPm);

	EqPm update(EqPm eqPm);
}
