package com.litbo.hospitalzj.supplier.service.impl;

import com.litbo.hospitalzj.supplier.controller.ex.HtInfoIsNullException;
import com.litbo.hospitalzj.supplier.entity.SGb;
import com.litbo.hospitalzj.supplier.mapper.SGbMapper;
import com.litbo.hospitalzj.supplier.service.SGbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 国别业务层
 * @author 刘洋
 *
 */
@Service

public class SGbServiceImpl implements SGbService {
	@Autowired
	private SGbMapper sGbMapper;

	@Override
	public List<SGb> Select() {
		List<SGb> data =sGbMapper.select();
		return data;
	}
}
