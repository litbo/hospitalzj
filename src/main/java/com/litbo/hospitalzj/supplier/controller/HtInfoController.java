package com.litbo.hospitalzj.supplier.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.litbo.hospitalzj.hospital.enums.EnumProcess;
import com.litbo.hospitalzj.hospital.utils.FileUpload;
import com.litbo.hospitalzj.supplier.service.HtLcService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.controller.ex.FileUploadException;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.supplier.util.Upload;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;
import com.litbo.hospitalzj.util.ResponseResult;


@RestController
@RequestMapping("/htInfo")
public class HtInfoController extends BaseController{
	@Autowired
	private HtInfoService htinfoService;
	@Autowired
	public HtLcService htLcService;
	@RequestMapping("/insert")
	public ResponseResult<Integer> insertHtInfo(HtInfo htInfo,HttpSession session){
		htInfo.setSbcsId(getUidFromSession(session));
		htinfoService.InsertHtInfo(htInfo);
		int htId=htInfo.getHtId();
		session.setAttribute("htId", htId);
		htinfoService.updateHtInfoState(htId, EnumProcess.WAIT_ACCEPT.getCode());
		htLcService.InsertHtLc(htId,EnumProcess.CONTRACT_ENTRY.getMessage(),new Date());
		return new ResponseResult<Integer>(SUCCESS,htInfo.getHtId());
	}

	@RequestMapping("/yyys")
	public ResponseResult<Void> updataStatePerfect(String view,Integer htId){
		if("同意".equals(view)){
			//预约验收
			htinfoService.updateHtInfoState(htId, EnumProcess. APPOINMENT_ACCEPTANCE.getCode());
			htLcService.InsertHtLc(htId,EnumProcess.APPOINMENT_ACCEPTANCE.getMessage(),new Date());
		}else{
			//合同信息不完善
			htinfoService.updateHtInfoState(htId, EnumProcess.IMPERFECT_CONTRACT_INFORMATION.getCode());
			htLcService.InsertHtLc(htId,EnumProcess.IMPERFECT_CONTRACT_INFORMATION.getMessage(),new Date());
		}
		return new ResponseResult<Void>(SUCCESS);
	}
	//完善资料
	@RequestMapping("/wszl")
	public ResponseResult<Void> updataStatePerfectOne(Integer htId){
		htinfoService.updateHtInfoState(htId, EnumProcess. PERFECT_INFORMATION.getCode());
		htLcService.InsertHtLc(htId,EnumProcess.PERFECT_INFORMATION.getMessage(),new Date());
		return new ResponseResult<Void>(SUCCESS);
	}
	//等待审核验收
	@RequestMapping("/ddshjys")
	public ResponseResult<Void> updataStatePerfectTwo(Integer htId){
		htinfoService.updateHtInfoState(htId, EnumProcess. WAIT_ACCEPT_YS.getCode());
		htLcService.InsertHtLc(htId,EnumProcess.WAIT_ACCEPT_YS.getMessage(),new Date());
		return new ResponseResult<Void>(SUCCESS);
	}
	//验收完成
	@RequestMapping("/yswc")
	public ResponseResult<Void> updataStatePerfectThree(Integer htId){
		htinfoService.updateHtInfoState(htId, EnumProcess.ACCEPT_OVER.getCode());
		htLcService.InsertHtLc(htId,EnumProcess.ACCEPT_OVER.getMessage(),new Date());
		return new ResponseResult<Void>(SUCCESS);
	}

	@RequestMapping("/updateInfo")
	public ResponseResult<HtInfo> updateInfo(HtInfo htInfo){
		HtInfo data=htinfoService.updateInfo(htInfo);
		htLcService.InsertHtLc(data.getHtId(),EnumProcess.REVISE_A_CONTRACT.getMessage(),new Date());
		return new ResponseResult<HtInfo>(SUCCESS);
	}
	@RequestMapping("/select")
	public ResponseResult<List<EqHtVo>> selectEqHtVo(String htYzm){
		List<EqHtVo> data=htinfoService.selectEqHtVo(htYzm);
		return new ResponseResult<List<EqHtVo>>(SUCCESS,data);
	}
	@RequestMapping("/yzm")
	public ResponseResult<HtInfo> selectHtInfo(String htYzm){
		HtInfo data=htinfoService.selectHtInfo(htYzm);
		return new ResponseResult<HtInfo>(SUCCESS,data);
	}
	@RequestMapping("/selectOne")
	public ResponseResult<HtInfo> selectOne(Integer htId){
		HtInfo data=htinfoService.select(htId);
		return new ResponseResult<HtInfo>(SUCCESS,data);
	}
	@RequestMapping("/updateYzm")
	public ResponseResult<Void> updataYzm(@RequestParam("htId")Integer htId,@RequestParam("htYzm")String htYzm,HttpSession session){
		htinfoService.updateYzm(htId, htYzm,EnumProcess.WAIT_ACCEPT.getCode());
		htLcService.InsertHtLc(htId,EnumProcess.WAIT_ACCEPT.getMessage(),new Date());
		return new ResponseResult<Void>(SUCCESS);
	}
	/*@RequestMapping("/selectEqHt")
	public ResponseResult<Void> selectEqHtVo(String htYzm){
		htinfoService.selectEqHtVo(htYzm);
		return new ResponseResult<Void>(SUCCESS);
	}*/
	@RequestMapping("/selectHtInfo")
	public ResponseResult<List<HtInfo>> selectHtInfo(HttpSession session){
		Integer sbcsId=getUidFromSession(session);
		List<HtInfo> htInfos=htinfoService.selectHtinfo(sbcsId);
		return new ResponseResult<List<HtInfo>>(SUCCESS,htInfos);
	}
	@PostMapping("/uploadOne")
	public ResponseResult<String> uploadOne(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file){
		String htFile1 = FileUpload.upload("images/upload/",file);
		htinfoService.updateTwo(htId, htFile1);
		// 返回
		ResponseResult<String> rr = new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile1);
		return rr;
	}
	@PostMapping("/uploadTwo")
	public ResponseResult<String> uploadTwo(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		String htFile2 = FileUpload.upload("images/upload/",file);
		htinfoService.updateTwo(htId, htFile2);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile2);
		return rr;
	}
	@PostMapping("/uploadThree")
	public ResponseResult<String> uploadThree(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		String htFile3 = FileUpload.upload("images/upload/",file);
		htinfoService.updateTwo(htId,htFile3);
		// 返回
		ResponseResult<String> rr = new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile3);
		return rr;
	}
	@PostMapping("/uploadFour")
	public ResponseResult<String> uploadFour(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		String htFile4 = FileUpload.upload("images/upload/",file);
		htinfoService.updateTwo(htId,htFile4);
		// 返回
		ResponseResult<String> rr = new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile4);
		return rr;
	}
	@PostMapping("/uploadFive")
	public ResponseResult<String> uploadFive(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		String htFile5 = FileUpload.upload("images/upload/",file);
		htinfoService.updateTwo(htId,htFile5);
		// 返回
		ResponseResult<String> rr = new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile5);
		return rr;
	}
}
