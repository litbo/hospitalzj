package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.w3c.dom.ls.LSInput;

import com.litbo.hospitalzj.supplier.entity.EqLy;
/**
 * 设备来源持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqLyMapper {
	@Select("SELECT eqly_id eqlyId, eqly_name eqlyName FROM eq_ly WHERE eqly_id=#{eqlyId}")
	EqLy findById(@Param("eqlyId")String eqlyId);
	@Select("SELECT eqly_id eqlyId, eqly_name eqlyName FROM eq_ly")
	List<EqLy> findAll();
}
