package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
/**
 * 设备来源持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqCgMapper {
	@Select("SELECT eqcg_id eqcgId, eqcg_name eqcgName FROM eq_cgfs WHERE eqcg_id=#{eqcgId}")
	EqCgfs findById(@Param("eqcgId")String eqcgId);
	@Select("SELECT eqcg_id eqcgId, eqcg_name eqcgName FROM eq_cgfs")
	List<EqCgfs> findAll();
}
