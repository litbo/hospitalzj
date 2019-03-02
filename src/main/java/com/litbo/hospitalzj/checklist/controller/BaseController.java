package com.litbo.hospitalzj.checklist.controller;

import com.litbo.hospitalzj.checklist.domain.Dcsjhy;
import com.litbo.hospitalzj.checklist.domain.Dqjc;
import com.litbo.hospitalzj.checklist.domain.EqZjls;
import com.litbo.hospitalzj.checklist.service.BaseService;
import com.litbo.hospitalzj.checklist.service.DcsjhyService;
import com.litbo.hospitalzj.checklist.service.DqjcService;
import com.litbo.hospitalzj.checklist.service.EqZjlsService;
import com.litbo.hospitalzj.checklist.utils.commons.CommonUtils;
import com.litbo.hospitalzj.checklist.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;




/**
 *
 * @author bigStone
 *
 */
@Controller
@RequestMapping("/table")
public class BaseController {

	@Autowired
	private BaseService baseService;

	@Autowired
	private DqjcService dqjcService;

	@Autowired
	private DcsjhyService dcsjhyService;

	@Autowired
	private EqZjlsService eqZjlsService;

	/**
	 * 根据表名查询对应模板表
	 * 参数： 设备id
	 * @param tableId
	 * @param obj
	 * @return
	 */
	@RequestMapping("/findTemplate/{eq_id}")
	@ResponseBody
	public ResponseResult<Object> findTemplate(@PathVariable("eq_id") String eq_id){
		String tableName = baseService.findTableName(eq_id);
		System.out.println(tableName);
		if(tableName == null){
			Dqjc dqjc = dqjcService.findTemplate();
			return new ResponseResult<Object>(200, dqjc);
		}
		if(tableName.equals("dcsjhy")){
			String t_name = "dcsjhy_template";
			Dcsjhy dcsjhy = dcsjhyService.findTemplate(t_name);

			return new ResponseResult<Object>(200, dcsjhy);
		}
		else{
			return new ResponseResult<Object>(400, "暂无此表");
		}
	}

	/**
	 * 保存相应的检测表
	 * @param eqId
	 * @param req
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public ResponseResult<Object> save(@RequestParam("eqId") String eqId,HttpServletRequest req){
		String tableName = baseService.findTableName(eqId);
		EqZjls eqZjls = CommonUtils.toBean(req.getParameterMap(), EqZjls.class);
		System.out.println(eqZjls);
		if(tableName == null){
			Dqjc dqjc = CommonUtils.toBean(req.getParameterMap(), Dqjc.class);
			eqZjlsService.save(eqZjls);
			dqjcService.save(dqjc);
			return new ResponseResult<Object>(200, dqjc);
		}

		if(tableName.equals("dcsjhy")){
			Dcsjhy dcsjhy = CommonUtils.toBean(req.getParameterMap(), Dcsjhy.class);
			eqZjlsService.save(eqZjls);
			dcsjhyService.save(dcsjhy);
			return new ResponseResult<Object>(200, dcsjhy);
		}
		else{
			return new ResponseResult<Object>(400, "暂无此表");
		}
	}

	/**
	 * 查询表
	 * @param eqId
	 * @return
	 */
	@RequestMapping("/findTable/{eqId}")
	public ResponseResult<Object> findTable( @PathVariable("eqId") String eqId){
		String tableName = baseService.findTableName(eqId);
		if(tableName == null){
			Dqjc dqjc = dqjcService.findDqjc(eqId);
			return new ResponseResult<Object>(200, dqjc);
		}
		if(tableName.equals("dcsjhy")){

			Dcsjhy dcsjhy = dcsjhyService.findDcsjhy(eqId);

			return new ResponseResult<Object>(200, dcsjhy);
		}
		else{
			return new ResponseResult<Object>(400, "暂无此表");
		}
	}


}
