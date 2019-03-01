package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqPm;
import com.litbo.hospitalzj.supplier.service.EqPmService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 设备品名控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqpm")
public class EqPmController extends BaseController{
	@Autowired
	public EqPmService eqPmService;
	
	@RequestMapping("/{eqPmId}")
	public ResponseResult<EqPm> getByCode(@PathVariable("eqPmId") String eqPmId) {
		EqPm data= eqPmService.getById(eqPmId);
		return new ResponseResult<EqPm>(SUCCESS,data);
	}
	@RequestMapping("/all")
	public ResponseResult<List<EqPm>> getAll() {
		List<EqPm> data= eqPmService.getAll();
		return new ResponseResult<List<EqPm>>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(EqPm eqPm) {
		eqPmService.insert(eqPm);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> idelete(String eqPmId) {
		eqPmService.delete(eqPmId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<EqPm> update(EqPm eqPm) {
		EqPm data=eqPmService.update(eqPm);
		return new ResponseResult<EqPm>(SUCCESS,data);
	}
}
