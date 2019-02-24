package com.litbo.hospitalzj.supplier.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.controller.ex.FileUploadException;
import com.litbo.hospitalzj.supplier.entity.EqFj;
import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.supplier.util.Upload;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;
import com.litbo.hospitalzj.util.ResponseResult;
import com.mysql.cj.Session;

@RestController
@RequestMapping("/htInfo")
public class HtInfoController extends BaseController{
	@Autowired
	private HtInfoService htinfoService;
	@RequestMapping("/insert")
	public ResponseResult<Integer> insertHtInfo(HtInfo htInfo,HttpSession session){
		htInfo.setSbcsId(getUidFromSession(session));
		htinfoService.InsertHtInfo(htInfo);
		int htId=htInfo.getHtId();
		session.setAttribute("htId", htId);
		return new ResponseResult<Integer>(SUCCESS,htInfo.getHtId());
	}
	/*@RequestMapping("updataState")
	public ResponseResult<Void> updataState(String htState){
		return new ResponseResult<Void>(SUCCESS);
	}*/
	
	@RequestMapping("/updateInfo")
	public ResponseResult<Void> updateInfo(HtInfo htInfo){
		htinfoService.updateInfo(htInfo);
		return new ResponseResult<Void>(SUCCESS);
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
		htinfoService.updateYzm(htId, htYzm, 1);
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
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session
				.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		System.out.println(parentPath);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
		System.out.println(fileName);
		// 确定文件
		File dest = new File(parent, fileName);

		// 执行保存文件
		try {
			file.transferTo(dest);
			System.err.println("上传完成！");
		} catch (IllegalStateException |IOException e) {
			throw new FileUploadException("文件上传异常");
		} 

		// 获取当前用户的id
		// 获取当前用户的id
		String htFile1 = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		System.out.println(htFile1);
		htinfoService.updateOne(htId, htFile1);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile1);
		return rr;
	}
	@PostMapping("/uploadTwo")
	public ResponseResult<String> uploadTwo(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session
				.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		System.out.println(parentPath);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
		System.out.println(fileName);
		// 确定文件
		File dest = new File(parent, fileName);

		// 执行保存文件
		try {
			file.transferTo(dest);
			System.err.println("上传完成！");
		} catch (IllegalStateException |IOException e) {
			throw new FileUploadException("文件上传异常");
		} 

		// 获取当前用户的id
		// 获取当前用户的id
		String htFile2 = "/" + UPLOAD_DIR_NAME + "/" + fileName;
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
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session
				.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		System.out.println(parentPath);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
		System.out.println(fileName);
		// 确定文件
		File dest = new File(parent, fileName);

		// 执行保存文件
		try {
			file.transferTo(dest);
			System.err.println("上传完成！");
		} catch (IllegalStateException |IOException e) {
			throw new FileUploadException("文件上传异常");
		} 

		// 获取当前用户的id
		// 获取当前用户的id
		String htFile3 = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		htinfoService.updateThree(htId, htFile3);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile3);
		return rr;
	}
	@PostMapping("/uploadFour")
	public ResponseResult<String> uploadFour(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session
				.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		System.out.println(parentPath);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
		System.out.println(fileName);
		// 确定文件
		File dest = new File(parent, fileName);

		// 执行保存文件
		try {
			file.transferTo(dest);
			System.err.println("上传完成！");
		} catch (IllegalStateException |IOException e) {
			throw new FileUploadException("文件上传异常");
		} 

		// 获取当前用户的id
		// 获取当前用户的id
		String htFile4 = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		htinfoService.updateFour(htId, htFile4);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile4);
		return rr;
	}
	@PostMapping("/uploadFive")
	public ResponseResult<String> uploadFive(
			@RequestParam("htId") Integer htId,
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session
				.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		System.out.println(parentPath);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
		System.out.println(fileName);
		// 确定文件
		File dest = new File(parent, fileName);
		
		// 执行保存文件
		try {
			file.transferTo(dest);
			System.err.println("上传完成！");
		} catch (IllegalStateException |IOException e) {
			throw new FileUploadException("文件上传异常");
		} 
		
		// 获取当前用户的id
		// 获取当前用户的id
		String htFile5 = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		htinfoService.updateFive(htId, htFile5);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile5);
		return rr;
	}
}
