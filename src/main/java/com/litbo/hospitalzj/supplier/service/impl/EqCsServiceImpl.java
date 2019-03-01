package com.litbo.hospitalzj.supplier.service.impl;

import java.util.List;

import com.litbo.hospitalzj.supplier.service.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.supplier.controller.ex.UserYanzhengException;
import com.litbo.hospitalzj.supplier.entity.EqCs;
import com.litbo.hospitalzj.supplier.mapper.EqCsMapper;
import com.litbo.hospitalzj.supplier.service.EqCsService;

@Service
public class EqCsServiceImpl implements EqCsService{
	@Autowired
	private EqCsMapper eqcsMapper;
	@Override
	public EqCs Reg(EqCs eqcs) 
			throws DuplicateKeyException, InsertException {
		// 根据尝试注册的用户名查询用户数据
		System.out.println(eqcs);
		System.out.println(eqcs.getSbcsName());
		EqCs data = eqcsMapper.findBySbcsName(eqcs.getSbcsName());
		System.out.println(data);
		// 判断查询到的数据是否为null
		if (data==null) {
			eqcsMapper.gongAdd(eqcs);
			// 返回注册的用户对象
			return data;
		} else {
			// 否：用户名已被占用，抛出DuplicateKeyException异常
			throw new UserYanzhengException(
					"注册失败！尝试注册的用户名(" + eqcs.getSbcsName() + ")已经被占用！");
		}
	}

	@Override
	public void delete(Integer sbcsId) {
		EqCs data=findBySbcsId(sbcsId);
		if(data==null){
			throw new DeleteException("你所删除的供应商不存在");
		}
		eqcsMapper.deleteGongInfo(sbcsId);
	}
	private EqCs findByUsername(String SbcsName) {
		return eqcsMapper.findBySbcsName(SbcsName);
	}
	private EqCs findBySbcsId(Integer sbcsId) {
		return eqcsMapper.findBySbcsId(sbcsId);
	}
	@Override
	public List<EqCs> findAll() {
		return eqcsMapper.findAll();
	}

	@Override
	public EqCs findOne(Integer sbcsId) {
		return eqcsMapper.findBySbcsId(sbcsId);
	}

	
	@Override
	public EqCs login(String sbcsName, String sbcsPwd)
			throws UserNotFoundException, PasswordNotMatchException {
		// 根据参数username查询用户数据
		EqCs data = findByUsername(sbcsName);
		// 判断用户数据是否为null
		if (data == null) {
			// 是：为null，用户名不存在，则抛出UserNotFoundException
			throw new UserNotFoundException(
					"登录失败！您尝试登录的用户名不存在！");
		}
		// 	判断密码是否匹配
		if (sbcsPwd.equals(data.getSbcsPwd())) {
			System.out.println(data.getSbcsPwd());
			//是：匹配，密码正确，则判断是否被删除
			return data;
		}else {
			// 否：不匹配，密码错误，则抛出PasswordNotMatchException
			throw new PasswordNotMatchException(
					"登录失败！密码错误！");
		}
	}
	@Override
	public void updataInfo(EqCs eqcs) {
		eqcsMapper.updataInfo(eqcs);
	}

}
