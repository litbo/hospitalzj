package com.litbo.hospitalzj.supplier.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;

public interface HtInfoService {
	Integer InsertHtInfo(HtInfo htinfo);
	
	void updateYzm(@Param("htId") Integer htId, @Param("htYzm") String htYzm, @Param("htState") Integer htState);
	
/*	void updateState(@Param("htState") Integer htState);*/
	
	void updateInfo(HtInfo htinfo);
	
	HtInfo select(Integer htId);
	
	List<HtInfo> selectHtinfo(Integer sbcsId);

	List<HtInfo> selectAllHtInfo();
	
	List<EqHtVo> selectEqHtVo(String htYzm);
	
	HtInfo selectHtInfo(String htYzm);
	
	void updateOne(@Param("htId") Integer htId, @Param("htFile1") String htFile1);
	
	void updateTwo(@Param("htId") Integer htId, @Param("htFile2") String htFile2);
	
	void updateThree(@Param("htId") Integer htId, @Param("htFile3") String htFile3);
	
	void updateFour(@Param("htId") Integer htId, @Param("htFile4") String htFile4);
	
	void updateFive(@Param("htId") Integer htId, @Param("htFile5") String htFile5);

	int agreeHtInfoById(Integer htId, String yy, String date);

	int refuseHtInfoById(Integer htId, String yy, String date);
}
