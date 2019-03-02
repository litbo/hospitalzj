package com.litbo.hospitalzj.checklist.service;

import com.litbo.hospitalzj.checklist.dao.DcsjhyMapper;
import com.litbo.hospitalzj.checklist.domain.Dcsjhy;
import com.litbo.hospitalzj.checklist.domain.DcsjhyTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;

/**
 * 多参数监护仪service层
 * @author bigStone
 *
 */

@Service("dcsjhyService")
public class DcsjhyService {

	@Autowired
	private DcsjhyMapper dcsjhyMapper;

	//查询带有模板值的多参数监护仪的表数据
	public Dcsjhy findTemplate(String t_name) {
		DcsjhyTemplate dcsjhyTempate = dcsjhyMapper.findTemplate();
		Dcsjhy dcsjhy = new Dcsjhy();
		BeanUtils.copyProperties(dcsjhyTempate, dcsjhy);
		return dcsjhy;
	}
	//保存录入数据
	public void save(Dcsjhy dcsjhy) {
		DcsjhyTemplate dcsjhyTempate = dcsjhyMapper.findTemplate();
		BeanUtils.copyProperties(dcsjhyTempate, dcsjhy);
		dcsjhyMapper.save(dcsjhy);
	}
	
	//按照仪器id查询最新插入的仪器
	public Dcsjhy findDcsjhy(String eqId) {
		return dcsjhyMapper.findDcsjhy(eqId);
	}
}
