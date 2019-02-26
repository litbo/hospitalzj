package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.supplier.entity.EqPm;
/**
 * 设备品名持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqPmMapper {
	@Select("SELECT eq_pm_id eqPmId,eq_pm_name eqPmName FROM eq_pm WHERE eq_pm_id=#{eqPmId}")
	EqPm findById(@Param("eqPmId")String eqPmsd);
	@Select("SELECT eq_pm_id eqPmId,eq_pm_name eqPmId FROM eq_pm")
	List<EqPm> findAll();
}
