package com.litbo.hospitalzj.supplier.service;
/**
 * 合同流程业务层接口
 * @author 刘洋
 *
 */

import com.litbo.hospitalzj.supplier.entity.HtLc;


public interface HtLcService {
	HtLc InsertHtLc(HtLc htLc);
	void DeleteLc(Integer lcId);
	HtLc Select(Integer htId);
}
