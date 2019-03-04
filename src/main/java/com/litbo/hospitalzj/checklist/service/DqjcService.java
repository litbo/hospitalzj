package com.litbo.hospitalzj.checklist.service;

import com.litbo.hospitalzj.checklist.dao.DqjcMapper;
import com.litbo.hospitalzj.checklist.domain.Dqjc;
import com.litbo.hospitalzj.checklist.domain.DqjcTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 电气检测Service
 * @author bigStone
 *
 */
@Service("dqjcService")
public class DqjcService {

	@Autowired
	private DqjcMapper dqjcMapper;

	//根据表名查询电器检测模板表
	public Dqjc findTemplate() {
		DqjcTemplate dqjcTemplate = dqjcMapper.findTemplate();
		Dqjc dqjc = new Dqjc();
		BeanUtils.copyProperties(dqjcTemplate, dqjc);
		return dqjc;
	}

	//保存带有检测数据的电器检测表
	public void save(Dqjc dqjc) {
		DqjcTemplate dqjcTemplate = dqjcMapper.findTemplate();
		BeanUtils.copyProperties(dqjcTemplate, dqjc);
		dqjcMapper.save(dqjc);
	}

	//根据设备id查询设备检测表
	public Dqjc findDqjc(String eqId) {
		return dqjcMapper.findDqjc(eqId);
		
	}

}
