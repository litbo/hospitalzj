package com.litbo.hospitalzj.supplier.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqJfly;
import com.litbo.hospitalzj.supplier.entity.HtLc;
import com.litbo.hospitalzj.supplier.service.EqJfService;
import com.litbo.hospitalzj.supplier.service.HtLcService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 合同流程控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/htlc")
public class HtLcController extends BaseController{
	@Autowired
	public HtLcService htLcService;

	@RequestMapping("/insert")
	public ResponseResult<Void> insertHtLc(@Param("htId") Integer  htId , @Param("htCldz") String htCldz, @Param("htClsj") Date htClsj) {
		htLcService.InsertHtLc(htId,htCldz, htClsj);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> insertHtLc(Integer htId) {
		htLcService.DeleteLc(htId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/select")
	public ResponseResult<HtLc> selectHtLc(Integer htId) {
		HtLc data=htLcService.Select(htId);
		return new ResponseResult<HtLc>(SUCCESS,data);
	}
}
