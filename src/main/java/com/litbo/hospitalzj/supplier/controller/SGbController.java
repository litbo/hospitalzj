package com.litbo.hospitalzj.supplier.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.HtLc;
import com.litbo.hospitalzj.supplier.entity.SGb;
import com.litbo.hospitalzj.supplier.service.HtLcService;
import com.litbo.hospitalzj.supplier.service.SGbService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 国别控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/sgb")
public class SGbController extends BaseController{
	@Autowired
	public SGbService sGbService;

	@RequestMapping("/select")
	public ResponseResult<List<SGb>> selectHtLc() {
		List<SGb> data=sGbService.Select();
		return new ResponseResult<List<SGb>>(SUCCESS,data);
	}
}
