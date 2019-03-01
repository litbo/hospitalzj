package com.litbo.hospitalzj.supplier.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.controller.ex.FileEmptyException;
import com.litbo.hospitalzj.supplier.controller.ex.FileSizeOutOfLimitException;
import com.litbo.hospitalzj.supplier.controller.ex.FileTypeNotSupportException;
import com.litbo.hospitalzj.supplier.controller.ex.FileUploadException;
import com.litbo.hospitalzj.supplier.entity.EqCs;
import com.litbo.hospitalzj.supplier.service.EqCsService;
import com.litbo.hospitalzj.supplier.util.Upload;
import com.litbo.hospitalzj.util.ResponseResult;

@RestController
@RequestMapping("/supplier")
public class EqCsController extends BaseController{
	/**
	 * 上传文件夹的名称
	 */
	private static final String UPLOAD_DIR_NAME = "upload";
	/**
	 * 上传文件的最大大小
	 */
	private static final long FILE_MAX_SIZE = 5 * 1024 * 1024;
	/**
	 * 允许上传的文件类型
	 */
	private static final List<String> FILE_CONTENT_TYPES 
	= new ArrayList<>();
	/**
	 * 初始化允许上传的文件类型的集合
	 */
	static {
		FILE_CONTENT_TYPES.add("image/jpeg");
		FILE_CONTENT_TYPES.add("image/png");
		FILE_CONTENT_TYPES.add("image/jpg");
	}
	@Autowired
	private EqCsService eqcsService;
	@PostMapping("/gongReg")
	public ResponseResult<Void> Reg(EqCs eqcs,HttpSession session) throws IOException {
		eqcs.setSbcsCertificatep(getSctepFromSession(session));
		eqcs.setSbcsCreditcodep(getScdepFromSession(session));
		eqcsService.Reg(eqcs);
		session.setAttribute("sbcsName", eqcs.getSbcsName());
		return new ResponseResult<Void>(SUCCESS);
	}
	@PostMapping("/login")
	public ResponseResult<EqCs> handleLogin(
			@RequestParam("username") String sbcsName,
			@RequestParam("password") String sbcsPwd,
			HttpSession session) {
		// 执行登录
		EqCs user= eqcsService.login(sbcsName, sbcsPwd);
		session.setAttribute("sbcsName", user.getSbcsName());
		session.setAttribute("sbcsId", user.getSbcsId());
		// 返回
		return new ResponseResult<>(SUCCESS, user);
	}
	@PostMapping("/uploadOne")
	public ResponseResult<String> uploadOne(
			@RequestParam("file")MultipartFile file,
			HttpSession session){
		Upload.upload(file, session);
		// 确定上传文件夹 > session.getServletContext.getRealPath(UPLOAD_DIR_NAME) > exists() > mkdirs()
		String parentPath = session.getServletContext().getRealPath(UPLOAD_DIR_NAME);
		File parent = new File(parentPath);
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 确定文件名 > getOriginalFileName()
		String originalFileName = file.getOriginalFilename();
		int beginIndex = originalFileName.lastIndexOf(".");
		String suffix = originalFileName.substring(beginIndex);
		String fileName = System.currentTimeMillis() + "" + (new Random().nextInt(90000000) + 10000000) + suffix;
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
		String sbcsCertificatep = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		System.out.println(sbcsCertificatep);
		session.setAttribute("sbcsCertificatep", sbcsCertificatep);
		String a=getSctepFromSession(session);
		// 返回
		ResponseResult<String> rr= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(sbcsCertificatep);
		return rr;
	}
	@PostMapping("/uploadTwo")
	public ResponseResult<String> uploadTwo(
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
		String sbcsCreditCodep = "/" + UPLOAD_DIR_NAME + "/" + fileName;
		System.out.println(sbcsCreditCodep);
		session.setAttribute("sbcsCreditCodep", sbcsCreditCodep);
		String a=getScdepFromSession(session);
		System.out.println(sbcsCreditCodep);
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(sbcsCreditCodep);
		return rr;
	}


	@GetMapping("/delete")
	public ResponseResult<Void> delete(
			@RequestParam("sbcsId")Integer sbcsId,
			HttpSession session) {
		eqcsService.delete(sbcsId);
		return new ResponseResult<Void>(SUCCESS);
	}
	@GetMapping("/all")
	public ResponseResult<List<EqCs>> getAll() {
		List<EqCs> all= eqcsService.findAll();
		return new ResponseResult<List<EqCs>>(SUCCESS,all);
	}
	@RequestMapping("/one")
	public ResponseResult<EqCs> getOne(HttpSession session) {
		Integer sbcsId=getUidFromSession(session);
		EqCs all= eqcsService.findOne(sbcsId);
		return new ResponseResult<EqCs>(SUCCESS,all);
	}
	@RequestMapping("/updateInfo")
	public ResponseResult<EqCs> updataInfo(EqCs eqcs,HttpSession session) {
		eqcs.setSbcsCertificatep(getSctepFromSession(session));
		eqcs.setSbcsCreditcodep(getScdepFromSession(session));
		eqcs.setSbcsId(getUidFromSession(session));
		eqcsService.updataInfo(eqcs);
		return new ResponseResult<EqCs>(SUCCESS,eqcs);
	}
}
