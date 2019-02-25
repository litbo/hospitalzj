package com.litbo.hospitalzj.supplier.service.impl;

import java.util.List;

import com.litbo.hospitalzj.hospital.enums.EnumProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.controller.ex.HtInfoIsNullException;
import com.litbo.hospitalzj.service.exception.YzmNonentityException;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.mapper.EqHtFjVoMapper;
import com.litbo.hospitalzj.supplier.mapper.HtInfoMapper;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;

@Service
public class HtInfoServiceImpl implements HtInfoService {
	@Autowired
	public HtInfoMapper htInfoMapper;
    @Autowired
    public EqHtFjVoMapper eqhtfjMapper;
	@Override
	public Integer InsertHtInfo(HtInfo htInfo) {
		htInfoMapper.insertHt(htInfo);
		Integer a=htInfo.getHtId();
		System.out.println(a);
		return htInfo.getHtId();
	}
	@Override
	public List<EqHtVo> selectEqHtVo(String htYzm) {
		List<EqHtVo> date=htInfoMapper.EqHtVo(htYzm);
		if(date==null) {
			throw new YzmNonentityException("验证码不存在");
		}
		return date;
	}

	@Override
	public List<HtInfo> selectAllHtInfo() {
		List<HtInfo> data=htInfoMapper.findAll(EnumProcess.WAIT_ACCEPT.getCode());
		if (data== null) {
			throw new HtInfoIsNullException("合同不存在，请根据需要添加合同");
		}
		return data;
	}

	/*private Integer findByHtYzm(@Param("htYzm") String htYzm) {
            return htInfoMapper.findByHtYzm(htYzm);
        }*/
	/*@Override
	public void updateState(Integer htId, String htState) {
		htInfoMapper.updateState(htId, htState);
	}*/
	@Override
	public void updateOne(Integer htId, String htFile1) {
		htInfoMapper.updateOne(htId, htFile1);
	}
	@Override
	public void updateTwo(Integer htId, String htFile2) {
		htInfoMapper.updateTwo(htId, htFile2);
		
	}
	@Override
	public void updateThree(Integer htId, String htFile3) {
		htInfoMapper.updateThree(htId, htFile3);
		
	}
	@Override
	public void updateFour(Integer htId, String htFile4) {
		htInfoMapper.updateFour(htId, htFile4);
		
	}
	
	@Override
	public void updateFive(Integer htId, String htFile5) {
		htInfoMapper.updateFive(htId, htFile5);
	}
	
	@Override
	public void updateInfo(HtInfo htinfo) {
		htInfoMapper.updateInfo(htinfo);
	}
	@Override
	public List<HtInfo> selectHtinfo(Integer sbcsId) {
		List<HtInfo> data=htInfoMapper.findBySbcsId(sbcsId);
		if (data== null) {
			throw new HtInfoIsNullException("合同不存在，请根据需要添加合同");
		}
		return data;
	}
	@Override
	public void updateYzm(Integer htId, String htYzm, Integer htState) {
		htInfoMapper.updateYzm(htId,htYzm,htState);
	}
	@Override
	public HtInfo select(Integer htId) {
		HtInfo data=htInfoMapper.findByHtId(htId);
		if (data== null) {
			throw new HtInfoIsNullException("合同不存在，请根据需要添加合同");
		}
		return data;
	}
	@Override
	public HtInfo selectHtInfo(String htYzm) {
		HtInfo data=htInfoMapper.findByHtYzm(htYzm);
		if (data== null) {
			throw new HtInfoIsNullException("验证码不存在，请根据添加合同");
		}
		return data;
	}

	@Override
	public int agreeHtInfoById(Integer htId, String yy, String date) {
		return htInfoMapper.updateState(htId,yy,date,EnumProcess.APPOINMENT_ACCEPTANCE.getCode());
	}

	@Override
	public int refuseHtInfoById(Integer htId, String yy, String date) {
		return htInfoMapper.updateState(htId,yy,date,EnumProcess.IMPERFECT_CONTRACT_INFORMATION.getCode());
	}
}
