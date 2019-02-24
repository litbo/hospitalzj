package com.litbo.hospitalzj.supplier.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.supplier.entity.EqLy;
/**
 * 设备来源持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqLyMapper {
	@Select("SELECT eqly_code eqlyCode, eqly_name eqlyName FROM eq_ly WHERE eqly_code=#{eqlyCode}")
	EqLy findByCode(@Param("eqLycode") String eqLycode);
}
