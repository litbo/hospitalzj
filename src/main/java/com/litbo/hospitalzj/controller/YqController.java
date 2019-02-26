package com.litbo.hospitalzj.controller;

import com.litbo.hospitalzj.entity.Yq;
import com.litbo.hospitalzj.service.YqService;
import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.service.EqFjService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/yq")
public class YqController extends BaseController{
	@Autowired
	private YqService yqService;
	@RequestMapping("/insert")
	public ResponseResult<Void> insert(Yq yq){
		yqService.insert(yq);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/update")
	public ResponseResult<Void> update(Yq yq){
		yqService.update(yq);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/select")
	public ResponseResult<Yq> select(Integer jcyqId){
		Yq Yq=yqService.select(jcyqId);
		return new ResponseResult<Yq>(SUCCESS,Yq);
	}
	
}
