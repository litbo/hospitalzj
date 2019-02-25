package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.w3c.dom.ls.LSInput;

import com.litbo.hospitalzj.supplier.entity.EqJfly;
import com.litbo.hospitalzj.supplier.entity.EqLy;
/**
 * 设备经费持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqJfMapper {
	@Select("SELECT eqjf_id eqjfId, eqjf_name eqjfName FROM eq_jfly WHERE eqjf_id=#{eqjfId}")
	EqJfly findById(@Param("eqjfId")String eqjfId);
	@Select("SELECT eqjf_id eqjfId, eqjf_name eqjfName FROM eq_jfly")
	List<EqJfly> findAll();
}
