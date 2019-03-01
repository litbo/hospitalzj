package com.litbo.hospitalzj.user.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqLy;
import com.litbo.hospitalzj.supplier.service.EqLyService;
import com.litbo.hospitalzj.user.bean.SBm;
import com.litbo.hospitalzj.user.service.SBmService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 设备来源控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/sbm")
public class SBmController extends BaseController{
	@Autowired
	public SBmService sBmService;
	
	@RequestMapping("/update")
	public ResponseResult<Void> getByCode(SBm sBm) {
		sBmService.update(sBm);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("selectAll")
	public ResponseResult<List<SBm>> getAll() {
		List<SBm> data=sBmService.selectAll();
		return new ResponseResult<List<SBm>>(SUCCESS,data);
	}
	@RequestMapping("select")
	public ResponseResult<SBm> getone(String bmId) {
		SBm data=sBmService.select(bmId);
		return new ResponseResult<SBm>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(SBm sBm) {
		sBmService.insert(sBm);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> delete(String bmId) {
		sBmService.delete(bmId);
		return new ResponseResult<Void>(SUCCESS);
	}
}
