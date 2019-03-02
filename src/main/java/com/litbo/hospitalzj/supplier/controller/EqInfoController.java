package com.litbo.hospitalzj.supplier.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.litbo.hospitalzj.controller.BaseController;

import com.litbo.hospitalzj.supplier.entity.EqInfo;

import com.litbo.hospitalzj.supplier.service.EqInfoService;
import com.litbo.hospitalzj.supplier.vo.SelHtEqVo;
import com.litbo.hospitalzj.util.ResponseResult;


@RestController
@RequestMapping("/eqInfo")
public class EqInfoController extends BaseController{
	@Autowired
	private EqInfoService eqinfoService;
	@RequestMapping("/insert")
	public ResponseResult<Integer> insertEqInfo(EqInfo eqInfo,HttpSession session){
		/*Integer id=(Integer) session.getAttribute("htId");
		eqInfo.setHtIds(id);*/
		eqinfoService.InsertEqInfo(eqInfo);
		session.setAttribute("eqId", eqInfo.getEqId());
		System.out.println(eqInfo.getEqId());
		return new ResponseResult<Integer>(SUCCESS,eqInfo.getEqId());
	}
	@RequestMapping("/updateInfo")
	public ResponseResult<Void> updateInfo(EqInfo eqInfo){
		eqinfoService.updateInfo(eqInfo);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/selectEqHt")
	public ResponseResult<List<EqInfo>> selectEqInfo(Integer htIds,HttpSession session){
		List<EqInfo> eqInfo=eqinfoService.selectEqInfo(htIds);
		return new ResponseResult<List<EqInfo>>(SUCCESS,eqInfo);
	}
	@RequestMapping("/selectEqInfo")
	public ResponseResult<List<SelHtEqVo>> selectEqHt(Integer htIds,HttpSession session){
		List<SelHtEqVo> eqInfo=eqinfoService.selectEqHtVo(htIds);
		return new ResponseResult<List<SelHtEqVo>>(SUCCESS,eqInfo);
	}
	@RequestMapping("/selectEqId")
	public ResponseResult<Integer> findByEqId(Integer eqId){
		Integer data=eqinfoService.findHtId(eqId);
		return new ResponseResult<Integer>(SUCCESS,data);
	}
	@RequestMapping("/selectByState")
	public ResponseResult<List<EqInfo>> findByState(){
		List<EqInfo> data=eqinfoService.selectByState();
		return new ResponseResult<List<EqInfo>>(SUCCESS,data);
	}
	@RequestMapping("/delete")
	public ResponseResult<Void> delete(Integer eqId) {
		eqinfoService.delete(eqId);
		return new ResponseResult<Void>(SUCCESS);
	}
}
