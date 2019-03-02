package com.litbo.hospitalzj.supplier.service;
/**
 * 合同流程业务层接口
 * @author 刘洋
 *
 */

import com.litbo.hospitalzj.supplier.entity.HtLc;
import org.apache.ibatis.annotations.Param;

import java.util.Date;


public interface HtLcService {
	void InsertHtLc(@Param("htId") Integer htId, @Param("htCldz") String htCldz, @Param("htClsj") Date htClsj);
	void DeleteLc(Integer lcId);
	HtLc Select(Integer htId);
}
