package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

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
	
	@RequestMapping("/{parent}")
	public ResponseResult<EqLy> getByCode(@PathVariable("eqLycode") String eqLycode) {
		EqLy data=eqLyService.getByCode(eqLycode);
		return new ResponseResult<EqLy>(SUCCESS,data);
	}
}
