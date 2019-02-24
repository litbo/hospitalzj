package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.EqFjService;
import com.litbo.hospitalzj.supplier.service.EqInfoService;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.supplier.service.impl.EqFjServiceImpl;
import com.litbo.hospitalzj.util.ResponseResult;

@RestController
@RequestMapping("/eqfj")
public class EqFjController extends BaseController{
	@Autowired
	private EqFjService eqFjService;
	@RequestMapping("/insert")
	public ResponseResult<Void> insertEqFj(EqFj eqFj,HttpSession session){
		eqFjService.insertEqFj(eqFj);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/updateInfo")
	public ResponseResult<Void> updateInfo(EqFj eqFj,HttpSession session){
		eqFjService.updateInfo(eqFj);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/selectInfo")
	public ResponseResult<List<EqFj>> selectInfo(Integer eqIds){
		List<EqFj> eqFj=eqFjService.selectInfo(eqIds);
		return new ResponseResult<List<EqFj>>(SUCCESS,eqFj);
	}
	
}
