package com.litbo.hospitalzj.checklist.service;

import com.litbo.hospitalzj.checklist.dao.EqZjlsMapper;
import com.litbo.hospitalzj.checklist.domain.EqZjls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 设备质检流水Service层
 * @author bigStone
 *
 */
@Service("eqZjlsService")
public class EqZjlsService {
	
	@Autowired
	private EqZjlsMapper eqZjlsMapper;

	//保存质检流水记录

	public void save(EqZjls eqZjls) {
		eqZjlsMapper.save(eqZjls);
		
	}
	
}
