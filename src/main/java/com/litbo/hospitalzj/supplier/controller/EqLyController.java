package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.supplier.entity.EqJfly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.service.EqLyService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 设备来源控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqly")
public class EqLyController extends BaseController{
	@Autowired
	public EqLyService eqLyService;
	
	@RequestMapping("/{eqlyId}")
	public ResponseResult<EqLy> getByCode(@PathVariable("eqlyId") String eqlyId) {
		EqLy data=eqLyService.getById(eqlyId);
		return new ResponseResult<EqLy>(SUCCESS,data);
	}
	@RequestMapping("all")
	public ResponseResult<List<EqLy>> getAll() {
		List<EqLy> data=eqLyService.getAll();
		return new ResponseResult<List<EqLy>>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(EqLy eqLy) {
		eqLyService.insert(eqLy);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> idelete(String eqlyId) {
		eqLyService.delete(eqlyId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<EqLy> update(EqLy eqLy) {
		EqLy data=eqLyService.update(eqLy);
		return new ResponseResult<EqLy>(SUCCESS,data);
	}
}
