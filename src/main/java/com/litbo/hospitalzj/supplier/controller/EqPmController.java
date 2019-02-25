package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

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
	@RequestMapping("all")
	public ResponseResult<List<EqPm>> getAll() {
		List<EqPm> data= eqPmService.getAll();
		return new ResponseResult<List<EqPm>>(SUCCESS,data);
	}
}
