package com.litbo.hospitalzj.supplier.service;
/**
 * 设备申购类别业务层接口
 * @author 刘洋
 *
 */

import java.util.List;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface EqSglbService {

	EqSglb getById(String eqsgId);
	

	List<EqSglb> getAll();

	void delete(String eqsgId);

	void insert(EqSglb eqSglb);
	EqSglb update(EqSglb eqSglb);
}
