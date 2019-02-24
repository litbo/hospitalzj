package com.litbo.hospitalzj.supplier.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.litbo.hospitalzj.supplier.vo.EqHtFjVo;
import com.litbo.hospitalzj.supplier.vo.InsertEqHtFiVo;

public interface EqHtFjVoService {
	
	int insert(InsertEqHtFiVo insertEqHtFiVo);
	
	List<EqHtFjVo> findEqHtFjVo(@Param("htYzm") String htYzm);

}
