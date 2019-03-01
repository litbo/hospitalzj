package com.litbo.hospitalzj.supplier.controller;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
import com.litbo.hospitalzj.supplier.mapper.EqYtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqYt;
import com.litbo.hospitalzj.supplier.service.EqYtService;
import com.litbo.hospitalzj.util.ResponseResult;
/**
 * 设备用途控制层
 * @author 刘洋
 *
 */
@RestController
@RequestMapping("/eqyt")
public class EqYtController extends BaseController{
	@Autowired
	public EqYtService eqYtService;
	
	@RequestMapping("/{eqytId}")
	public ResponseResult<EqYt> getByCode(@PathVariable("eqytId") String eqytId) {
		EqYt data=eqYtService.getById(eqytId);
		return new ResponseResult<EqYt>(SUCCESS,data);
	}
	@RequestMapping("/all")
	public ResponseResult<List<EqYt>> getAll() {
		List<EqYt> data=eqYtService.getAll();
		return new ResponseResult<List<EqYt>>(SUCCESS,data);
	}
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(EqYt eqYt) {
		System.out.println(eqYt);
		eqYtService.insert(eqYt);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> delete(String eqytId) {
		eqYtService.delete(eqytId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<EqYt> update(EqYt eqYt) {
		EqYt data=eqYtService.update(eqYt);
		return new ResponseResult<EqYt>(SUCCESS,data);
	}
}
