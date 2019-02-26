package com.litbo.hospitalzj.supplier.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.litbo.hospitalzj.supplier.service.exception.PasswordNotMatchException;
import com.litbo.hospitalzj.supplier.service.exception.UpdateException;
import com.litbo.hospitalzj.supplier.service.exception.UserNotFoundException;
import com.litbo.hospitalzj.supplier.entity.EqCs;


public interface EqCsService {
	
	EqCs Reg(EqCs eqcs);
	
	void delete(@Param("sbcsId") Integer sbcsId);
	
	List<EqCs> findAll();
	
	EqCs findOne(@Param("sbcsId") Integer sbcsId);
	
	EqCs login(@Param("sbcsName") String sbcsName, @Param("sbcsPwd") String sbcsPwd) throws UserNotFoundException, PasswordNotMatchException;
	
	void updataInfo(EqCs eqcs);

}
