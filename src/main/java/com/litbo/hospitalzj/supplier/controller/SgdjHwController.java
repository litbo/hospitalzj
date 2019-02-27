package com.litbo.hospitalzj.supplier.controller;

import javax.servlet.http.HttpSession;

import com.litbo.hospitalzj.hospital.enums.EnumProcess;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.controller.ex.FileUploadException;
import com.litbo.hospitalzj.supplier.entity.SgdjHw;
import com.litbo.hospitalzj.supplier.service.SgdjHwService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/sgdjhw")
public class SgdjHwController extends BaseController{
	@Autowired
	private SgdjHwService sgdjHwService;

	@RequestMapping("/select")
	public ResponseResult<SgdjHw> select(Integer htIds,HttpSession session) {
		SgdjHw all= sgdjHwService.selectSgdjHw(htIds);
		return new ResponseResult<SgdjHw>(SUCCESS,all);
	}
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public ResponseResult<Void> insert(SgdjHw sgdjHw, MultipartFile file[]) {

		int res  = sgdjHwService.InsertSgdjHw(sgdjHw);
		return new ResponseResult<Void>(SUCCESS);
	}
	@RequestMapping("/updateInfo")
	public ResponseResult<Void> updateInfo(SgdjHw sgdjHw) {
		sgdjHwService.updateInfo(sgdjHw);
		return new ResponseResult<Void>(SUCCESS);
	}
	/*@RequestMapping("/upload")
	public ResponseResult<String> uploadFive(
			@RequestParam("djhwId")Integer djhwId,
			SgdjHw SgdjHw,
			@RequestParam("file")MultipartFile[] files,
			HttpSession session){
		for (int i = 1; i <= files.length; i++) {
			MultipartFile file = files[i];
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
			String htFile = "/" + UPLOAD_DIR_NAME + "/" + fileName;
			if(i==1){
				SgdjHw.setDjhwBz1(htFile);
			}else if(i==2){
				SgdjHw.setDjhwBz2(htFile);
			}else if(i==3){
				SgdjHw.setDjhwBz3(htFile );
			}else if(i==4){
				SgdjHw.setDjhwBz4(htFile );
			}else if(i==5){
				SgdjHw.setDjhwBz5(htFile );
			}

		
			sgdjHwService.
		// 返回
		ResponseResult<String> rr
		= new ResponseResult<>();
		rr.setState(SUCCESS);
		rr.setData(htFile5);
		return rr;
	}
}
*/
}
