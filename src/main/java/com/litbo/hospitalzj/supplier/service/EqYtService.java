package com.litbo.hospitalzj.supplier.service;
/**
 * 设备用途业务层接口
 * @author 刘洋
 *
 */

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqYt;
import org.apache.ibatis.annotations.Insert;

public interface EqYtService {

	EqYt getById(String eqytId);

	List<EqYt> getAll();

	void delete(String eqytId);

	void insert(EqYt eqYt);

	EqYt update(EqYt eqYt);
}
