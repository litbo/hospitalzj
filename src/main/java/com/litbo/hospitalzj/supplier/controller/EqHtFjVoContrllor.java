package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.service.EqHtFjVoService;
import com.litbo.hospitalzj.supplier.vo.EqHtFjVo;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;
import com.litbo.hospitalzj.supplier.vo.InsertEqHtFiVo;
import com.litbo.hospitalzj.util.ResponseResult;

@RestController
public class EqHtFjVoContrllor extends BaseController{
	@Autowired
	private EqHtFjVoService eqHtFjService;
	@RequestMapping("selectEqHtFj")
	public ResponseResult<List<EqHtFjVo>> selectsEqHtFj(String htYzm){
		List<EqHtFjVo> data=eqHtFjService.findEqHtFjVo(htYzm);
		return new ResponseResult<List<EqHtFjVo>>(SUCCESS,data);
	}
	@RequestMapping("insertEqHtFj")
	public ResponseResult<Void> insertEqHtFj(@RequestBody InsertEqHtFiVo insertEqHtFiVo){
		eqHtFjService.insert(insertEqHtFiVo);
		return new ResponseResult<Void>(SUCCESS);
	}
}
