package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.supplier.entity.EqYt;
import com.litbo.hospitalzj.supplier.service.EqCgService;
import com.litbo.hospitalzj.supplier.service.EqYtService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 设备用途控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqcg")
public class EqCgController extends BaseController{
	@Autowired
	public EqCgService eqCgService;
	
	@RequestMapping("/{eqcgId}")
	public ResponseResult<EqCgfs> getByCode(@PathVariable("eqcgId") String eqcgId) {
		EqCgfs data=eqCgService.getById(eqcgId);
		return new ResponseResult<EqCgfs>(SUCCESS,data);
	}
	@RequestMapping("/all")
	public ResponseResult<List<EqCgfs>> getAll() {
		List<EqCgfs> data=eqCgService.getAll();
		return new ResponseResult<List<EqCgfs>>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(EqCgfs eqCgfs) {
		eqCgService.insert(eqCgfs);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> delete(String eqcgId) {
		eqCgService.delete(eqcgId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<EqCgfs> update(EqCgfs eqCgfs) {
		EqCgfs data=eqCgService.update(eqCgfs);
		return new ResponseResult<EqCgfs>(SUCCESS,data);
	}
}
