package com.litbo.hospitalzj.supplier.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.litbo.hospitalzj.supplier.controller.ex.FileEmptyException;
import com.litbo.hospitalzj.supplier.controller.ex.FileSizeOutOfLimitException;
import com.litbo.hospitalzj.supplier.controller.ex.FileTypeNotSupportException;

public  abstract class Upload {
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
	public static void upload(MultipartFile file,HttpSession session) {
		// 检查是否存在上传文件 > file.isEmpty()
				if (file.isEmpty()) {
					// 抛出异常：文件不允许为空
					throw new FileEmptyException(
							"上传失败！没有选择上传的文件，或选中的文件为空！");
				}
				// TODO 检查文件大小 > file.getSize()
				if (file.getSize() > FILE_MAX_SIZE) {
					// 抛出异常：文件大小超出限制
					throw new FileSizeOutOfLimitException("上传失败！文件过大");
				}
				// TODO 检查文件类型 > file.getContentType()
				if (!FILE_CONTENT_TYPES.contains(
						file.getContentType())) {
					// 抛出异常：文件类型限制
					throw new FileTypeNotSupportException("文件类型不符");
				}
				
	}
}
