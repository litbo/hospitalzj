package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqJfly;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.service.EqJfService;
import com.litbo.hospitalzj.supplier.service.EqLyService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 设备经费控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqjf")
public class EqJfController extends BaseController{
	@Autowired
	public EqJfService eqJfService;
	
	@RequestMapping("/{eqjfId}")
	public ResponseResult<EqJfly> getByCode(@PathVariable("eqjfId") String eqjfId) {
		EqJfly data=eqJfService.getById(eqjfId);
		return new ResponseResult<EqJfly>(SUCCESS,data);
	}
	@RequestMapping("/all")
	public ResponseResult<List<EqJfly>> getAll() {
		List<EqJfly> data=eqJfService.getAll();
		return new ResponseResult<List<EqJfly>>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(EqJfly eqJfly) {
		eqJfService.insert(eqJfly);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> delete(@RequestParam("eqjfId")String eqjfId) {
		eqJfService.delete(eqjfId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<EqJfly> update(EqJfly eqJfly) {
		EqJfly data=eqJfService.update(eqJfly);
		return new ResponseResult<EqJfly>(SUCCESS,data);
	}
}
