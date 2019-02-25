package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
import com.litbo.hospitalzj.supplier.service.EqSglbService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 申购类别控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqsglb")
public class EqSglbController extends BaseController{
	@Autowired
	public EqSglbService eqSglbService;
	
	@RequestMapping("/{eqsgId}")
	public ResponseResult<EqSglb> getByCode(@PathVariable("eqsgId") String eqsgId) {
		EqSglb data=eqSglbService.getById(eqsgId);
		return new ResponseResult<EqSglb>(SUCCESS,data);
	}
	@RequestMapping("all")
	public ResponseResult<List<EqSglb>> getAll() {
		List<EqSglb> data=eqSglbService.getAll();
		return new ResponseResult<List<EqSglb>>(SUCCESS,data);
	}
}
