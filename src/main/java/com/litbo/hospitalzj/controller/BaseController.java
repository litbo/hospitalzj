package com.litbo.hospitalzj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.litbo.hospitalzj.supplier.controller.ex.EqFjIsNullException;
import com.litbo.hospitalzj.supplier.controller.ex.EqInfoIsNullException;
import com.litbo.hospitalzj.supplier.controller.ex.FileEmptyException;
import com.litbo.hospitalzj.supplier.controller.ex.FileSizeOutOfLimitException;
import com.litbo.hospitalzj.supplier.controller.ex.FileTypeNotSupportException;
import com.litbo.hospitalzj.supplier.controller.ex.FileUploadException;
import com.litbo.hospitalzj.supplier.controller.ex.HtInfoIsNullException;
import com.litbo.hospitalzj.supplier.controller.ex.RequestException;
import com.litbo.hospitalzj.supplier.controller.ex.UserYanzhengException;
import com.litbo.hospitalzj.supplier.service.exception.AccessDeniedException;
import com.litbo.hospitalzj.supplier.service.exception.AddressNotFoundException;
import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
import com.litbo.hospitalzj.supplier.service.exception.DuplicateKeyException;
import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import com.litbo.hospitalzj.supplier.service.exception.PasswordNotMatchException;
import com.litbo.hospitalzj.supplier.service.exception.ServiceException;
import com.litbo.hospitalzj.supplier.service.exception.UpdateException;
import com.litbo.hospitalzj.supplier.service.exception.UserNotFoundException;
import com.litbo.hospitalzj.util.ResponseResult;


/**
 * 当前项目中所有控制器类的基类
 */
public abstract class BaseController {
	/**
	 * 上传文件夹的名称
	 */
	protected static final String UPLOAD_DIR_NAME = "upload";
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
	/**
	 * 正确响应时的代号
	 */
	public static final Integer SUCCESS = 200;
	public static final Integer ERROR = 201;
	@ExceptionHandler({ServiceException.class,RequestException.class})
	@ResponseBody
	public ResponseResult<Void> handleException(
			Exception e) {
		Integer state = null;
		
		if (e instanceof DuplicateKeyException) {
			// 400-违反了Unique约束的异常
			state = 400;
		} else if (e instanceof UserNotFoundException) {
			// 401-用户数据不存在
			state = 401;
		} else if (e instanceof PasswordNotMatchException) {
			// 402-密码错误
			state = 402;
		} else if (e instanceof AddressNotFoundException) {
			// 403-收货地址数据不存在
			state = 403;
		} else if (e instanceof AccessDeniedException) {
			// 404-访问被拒绝的异常
			state = 404;
		} else if (e instanceof InsertException) {
			// 500-插入数据异常
			state = 500;
		} else if (e instanceof UpdateException) {
			// 501-更新数据异常
			state = 501;
		} else if (e instanceof DeleteException) {
			// 502-删除数据异常
			state = 502;
		} else if (e instanceof FileEmptyException) {
			// 600-上传的文件为空的异常
			state = 600;
		} else if (e instanceof FileSizeOutOfLimitException) {
			// 601-上传的文件超出了限制的异常
			state = 601;
		} else if (e instanceof FileTypeNotSupportException) {
			// 602-上传的文件类型不支持的异常
			state = 602;
		} else if (e instanceof FileUploadException) {
			// 610-文件上传异常
			state = 610;
		} else if (e instanceof UserYanzhengException) {
			// 603-用户验证失败
			state = 603;
		} else if (e instanceof HtInfoIsNullException) {
			// 701-合同不存在
			state = 701;
		} else if (e instanceof EqInfoIsNullException) {
			// 702—设备不存在
			state = 702;
		} else if (e instanceof EqFjIsNullException) {
			// 703-设备附件不存在
			state = 703;
		}
		
		return new ResponseResult<>(state, e);
	}
	
	/**
	 * 从Session中获取id
	 * @param session HttpSession对象
	 * @return 当前登录的用户的id
	 */
	protected Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(
				session.getAttribute("sbcsId").toString());
	}
	protected String getSctepFromSession(HttpSession session) {
		return String.valueOf(
				session.getAttribute("sbcsCertificatep").toString());
	}
	protected String getScdepFromSession(HttpSession session) {
		return String.valueOf(
				session.getAttribute("sbcsCreditCodep").toString());
	}
	
}




