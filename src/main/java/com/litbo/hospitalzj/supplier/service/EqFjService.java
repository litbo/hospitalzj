package com.litbo.hospitalzj.supplier.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.litbo.hospitalzj.supplier.entity.EqFj;

public interface EqFjService {
	EqFj insertEqFj(EqFj eqfj);
	
	void updateInfo(EqFj eqfj);
	
	List<EqFj> selectInfo(@Param("eqIds") Integer eqIds);
}
